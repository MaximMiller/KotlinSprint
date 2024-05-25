package org.example.lesson_15


abstract class User(
    val name: String,
) {
    fun readForum() {
        println("$name читает форум")
    }

    fun writeMessage(message: String) {
        println("$name: $message")
    }
}

class RegularUser(name: String) : User(name)

class Admin(name: String) : User(name) {
    fun deleteMessage(message: String) {
        println("Сообщение: [$message] удалено!")
    }

    fun deleteUser(user: User) {
        println("Юзер: [${user.name}] удален!")
    }
}


fun main() {
    val regularUser = RegularUser("Max")
    regularUser.readForum()
    regularUser.writeMessage("Привет")

    val admin = Admin("Bob")
    admin.deleteUser(regularUser)
    admin.deleteMessage("Привет")
    admin.readForum()
    admin.writeMessage("привет")
}
/*
На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения. Администраторы дополнительно
могут удалять сообщения и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы.
Действия на форуме отобрази сообщениями в консоль.
 */