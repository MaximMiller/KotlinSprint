package org.example.lesson_11

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val user = mutableListOf<ForumMember>()
    private val message = mutableListOf<ForumMessage>()
    private var userId = 1

    fun createNewUser(userName: String): ForumMember {
        val newMember = ForumMember(userId, userName)
        userId++
        user.add(newMember)
        return newMember
    }

    fun createNewMessage(userId: Int, newMessage: String) {
        val authorId = user.find { it.userId == userId }
        if (authorId != null) {
            val forumMessage = ForumMessage(userId, newMessage)
            message.add(forumMessage)
        } else {
            println("Пользователь не зарегистрирован на форуме")
        }
    }

    fun printThread() {
        for (message in message) {
            val user = user.find { it.userId == message.authorId }
            println("${user?.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val userOne = forum.createNewUser("Bob")
    forum.createNewMessage(userOne.userId, "Привет Anna!")
    val userTwo = forum.createNewUser("Anna")
    forum.createNewMessage(userTwo.userId, "И тебе привет Bob!")

    forum.printThread()
}
/*
Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для
сущностей “Член форума” (с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Фабрика” для создания пользователей и сообщений форума. Напрямую объекты не создаются,
логика должна быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя
в общий список и одновременно возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой
пользователь есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей

 */