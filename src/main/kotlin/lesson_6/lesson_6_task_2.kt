package org.example.lesson_6

const val NUMBER_OF_MILLISECONDS_IN_SECOND = 1_000

fun main() {
    /*
     Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь.
     По истечении заданного времени, выведется сообщение в консоли:
     “Прошло N секунд”. Где N – количество  секунд, введенных пользователем. Программа должна вставать на паузу.
     */
    println(
        "Это простой таймер, который засекает не более 60-ти секунд.\n" +
            "Введите количество секунд:",
    )
    val numberOfSeconds = readln().toLong()
    var second = "секунд"
    var passed = "Прошло"
    val listNumbersSecondOne = listOf<Long>(2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54)
    val listNumbersSecondTwo = listOf<Long>(1, 21, 31, 41, 51)

    while (true) {
        println("Запущен таймер на указанное Вами время")
        Thread.sleep(numberOfSeconds * NUMBER_OF_MILLISECONDS_IN_SECOND)
        if (numberOfSeconds in listNumbersSecondOne) {
            second = "секунды"
        } else if (numberOfSeconds in listNumbersSecondTwo) {
            passed = "Прошла"
            second = "секунда"
        }
        println("$passed $numberOfSeconds $second")
        break
    }
}
// Вань я знаю что инициатива наказуема! Я знаю что нужно следовать ТЗ, но ПМ был бы рад таким правкам))))
