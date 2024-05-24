package org.example.lesson_14


open class Message(
    val id: Int,
    val author: String,
    val textMessage: String,
)

class ChildMessage(
    id: Int,
    val parentMessageId: Int,
    author: String,
    textMessage: String,
) : Message(id, author, textMessage)

class Chat {
    val messages = mutableListOf<Message>()
    var numId = 0
    var childMessageId = 0
    fun addMessage(author: String, text: String) {
        messages.add(Message(++numId, author, text))
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        messages.add(ChildMessage(++childMessageId, parentMessageId, author, text))
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            if (message is ChildMessage) {
                message.parentMessageId
            } else {
                message.id
            }
        }

        groupedMessages.forEach { entry ->
            val messageList = entry.value
            messageList.forEach { message ->
                print("${message.author}: ${message.textMessage}\n")
                print("\t")
            }
            println()
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Max", "Всем привет")
    val parentMessageId = chat.numId
    chat.addThreadMessage(parentMessageId, "Anna", "Привет Max")
    chat.addThreadMessage(parentMessageId, "Max", "Как дела Anna?")
    chat.addThreadMessage(parentMessageId, "Anna", "Все круто!")
    chat.addMessage("Bob", "Кто будет сегодня катать?")
    val parentMessageId2 = chat.numId
    chat.addThreadMessage(parentMessageId2, "Fill", "Я пойду, го тима?")
    chat.addThreadMessage(parentMessageId2, "Bob", "Го")
    chat.printChat()
}

/*
Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord. К
ласс должен иметь следующие методы:

- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения),
дополнительно принимает на вход parentMessageId для идентификации сообщения,
под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat. Для создания сообщений соответствующих
типов используй классы Message и ChildMessage в соответствующей иерархии. У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить
для вывода табуляцию и печатать его под родительским сообщением. Используй groupBy() для группировки
сообщений по parentMessageId, если сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.
 */