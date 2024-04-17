package org.example.lesson_3

fun main() {
    /*
    При входе в приложение высвечивается приветствие. Представим, что мы пишем функцию,
    которая будет выводить приветствие с именем пользователя на экран (в нашем случае в консоль).
    Tекст приветствия может меняться в зависимости от времени суток. Так, например,
    выводится приветствие при входе в приложение Сбербанка.
    Приветствие и имя пользователя должны храниться в отдельных переменных. Вывести в консоль два приветствия (для дня и для вечера),
    перезаписывая данные в одну исходную переменную.
     */
    val nameUser = "Максим"
    val afternoonGreetings = "Добрый день"
    val eveningGreetings = "Добрый вечер"

    var defaultGreetings = afternoonGreetings
    println("$defaultGreetings $nameUser")
    defaultGreetings = eveningGreetings
    println("$defaultGreetings $nameUser")

}