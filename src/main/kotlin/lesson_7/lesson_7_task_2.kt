package org.example.lesson_7

fun main() {
    /*
        Создай программу, имитирующую авторизацию по коду из смс. Программа будет “высылать” код из четырех цифр
        (случайное число от 1000 до 9999). Выведи его в консоль с текстом “Ваш код авторизации: N”.
        Далее программа запрашивает ввод кода, чтобы авторизоваться.

       Если код введён неверно – программа вышлет новый (отобразит в консоли) и снова будет запрашивать его ввод для
        попытки авторизации. Если код введен верно – программа отображает приветствие и завершает работу
     */
    while (true) {
        val rangeIntCode = 1000..9999
        val codeAuthorization = rangeIntCode.random()
        println("Ваш код авторизации: $codeAuthorization")
        println("Чтобы аторизоваться - введите код из смс:")
        val userCode = readln().toInt()
        if (userCode == codeAuthorization) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неудача, попробуйте еще раз")
        }
    }
}
