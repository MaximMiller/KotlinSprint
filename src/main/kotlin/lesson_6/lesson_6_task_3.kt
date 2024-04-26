package org.example.lesson_6

const val NUMBER_OF_MILLISECONDS_IN_SECOND: Long = 1_000

fun main() {
    /*
     Нужно усовершенствовать таймер из задачи 6-2 так, чтобы он показывал пользователю
     сколько секунд осталось в процессе отсчета.

 – каждую секунду выводить сообщение такого формата: “Осталось секунд: N”;
 – по истечении таймера выводить сообщение “Время вышло”;
 – таймер должен быть написан, используя цикл while
     */
    println(
        "Это простой таймер! Введите количество секунд:",
    )
    var numberOfSeconds = readln().toInt()

    while (numberOfSeconds > 0) {
        println("Осталось ${numberOfSeconds--} секунд")
        Thread.sleep(NUMBER_OF_MILLISECONDS_IN_SECOND)
    }
    println("Время вышло")
}
