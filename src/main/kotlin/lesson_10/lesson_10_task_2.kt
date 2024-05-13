package org.example.lesson_10

const val MIN_NUMBER_LENGTH = 4
fun main() {
    /*
    Для регистрации в приложении пользователь придумывает логин и пароль.
    И логин, и пароль должны содержать в себе хотя бы 4 символа. Если всё верно,
    программа выводит приветственное сообщение.

    - считывай логин и пароль с консоли поочередно;
    - вынеси в отдельную функцию валидацию длины введенных данных;
    - если логин или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
     */
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    if (!isValidLength(login) || !isValidLength(password)) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isValidLength(anyLines: String): Boolean {
    if (anyLines.length > MIN_NUMBER_LENGTH) {
        return true
    } else {
        return false
    }
}
