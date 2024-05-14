package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {
    val admin = User(
        id = 1,
        login = "admin",
        password = "qwerty123%",
        mail = "admin@mail.ru",
    )
    val guest = User(
        id = 2,
        login = "guest",
        password = "guest123%",
        mail = "guest@mail.ru",
    )

    println(admin.id)
    println(admin.password)
    println(admin.login)
    println(admin.mail)
    println(guest.id)
    println(guest.password)
    println(guest.login)
    println(guest.mail)
}
