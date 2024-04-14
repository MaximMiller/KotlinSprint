package org.example.lesson_1

const val AMOUNT_SECOND_IN_HOUR = 3600
const val AMOUNT_SECOND_IN_MINUTE = 60
const val AMOUNT_SECOND_GAGARIN_SPENT_IN_SPACE = 6480

fun main() {
    /*
    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
     */
    println("Время, которое Гагарин провел в космосе: ${timeInSpace(AMOUNT_SECOND_GAGARIN_SPENT_IN_SPACE)}")

}

fun timeInSpace(second: Int): String {
    val hour = second / AMOUNT_SECOND_IN_HOUR
    val min = second / AMOUNT_SECOND_IN_MINUTE % AMOUNT_SECOND_IN_MINUTE
    val sec = second / 1 % 60 //вычисляется остаток секунд
    return String.format("%02d:%02d:%02d", hour, min, sec)
}