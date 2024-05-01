package org.example.lesson_6

const val NUMBER_OF_MILLISECONDS_IN_SECOND_ = 1_000

fun main() {
    /*
     Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь.
     По истечении заданного времени, выведется сообщение в консоли:
     “Прошло N секунд”. Где N – количество  секунд, введенных пользователем. Программа должна вставать на паузу.
     */
    println(
        "Это простой таймер! Введите количество секунд:"
    )
    val numberOfSeconds = readln().toLong()
    Thread.sleep(numberOfSeconds * NUMBER_OF_MILLISECONDS_IN_SECOND_)
    println("Прошло $numberOfSeconds секунд")
}
