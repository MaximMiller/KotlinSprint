package org.example.lesson_7

import org.example.lesson_6.NUMBER_OF_MILLISECONDS_IN_SECOND

fun main() {
    /*
    Cоздай таймер, который сперва запрашивает у пользователя количество секунд, которые нужно засечь.

 – таймер должен показывать каждую секунду, сколько времени осталось до конца;
 – по истечении времени, вывести сообщение в консоль: “Время вышло”;
 – таймер должен быть написан, используя цикл for.
     */
    println("Введите количество секунд, которые нужно засеч:")
    val countSecond = readln().toInt()

    for (i in countSecond downTo 1) {
        println("До конца таймера осталось: $i")
        Thread.sleep(NUMBER_OF_MILLISECONDS_IN_SECOND)
    }
    println("Время вышло")
}
