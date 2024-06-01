package org.example.lesson_17

class User(
    login: String,
    password: String,
) {
    var login = login
        get() = field
        set(value) {
            field = value
            println("Логин успешно изменен!\nНовый логин $value")
        }
    private var hidePassword = "*".repeat(password.length)

    var password = hidePassword
        get() = field
        set(value) {
            println("Вы не можете менять пароль!")
        }
}

fun main() {
    val user = User("login", "pasd24")
    user.login = "das"
    user.password = "qwe"
    println(user.password)

}
/*
Класс описывает пользователя и хранит свойства логин и пароль (без инициализации по умолчанию).

- при попытке изменить пароль, в консоль должно выводиться «Вы не можете изменить пароль».
- при попытке прочитать пароль – вместо символов должны отображаться звездочки (по количеству символов пароля).
- при изменении логина в консоли должно печататься сообщение об успешной смене логина.

Создай пользователя с произвольными данными и протестируй изменение логина и пароля.
Вся реализация должна быть на сеттерах и геттерах.
 */