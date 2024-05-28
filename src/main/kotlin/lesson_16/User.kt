package org.example.lesson_16

class User(
    private val login: String = "loginUser",
    private val password: String = "pass123@",
) {
    fun checkValidity(passwordUser: String): Boolean {
        return passwordUser == password
    }
}

fun main() {
    val userOne = User()
    println(userOne.checkValidity("dasd"))
}/*
Создай класс, описывающий пользователя, который хранит поля логин и пароль.

Пароль не должен быть виден в теле главной функции, но должен быть
 способ проверить, что пароль введен верно. Функция валидации должна
 принимать строку и возвращать результат проверки (и только его – без распечатки или генерации других строк).

Выведи информацию о релевантности пароля в консоль.
 */