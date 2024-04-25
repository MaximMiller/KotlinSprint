package org.example.lesson_5

fun main() {
    /*
     Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
     Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.
     Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
     Оформить ввод текстовыми подсказками о том, что нужно вводить. Вывести отдельным сообщением, какие числа были нужны для победы.

    - если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
    - если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
    - если не угадано ничего, вывести “Неудача!”;
    - программа должна учитывать ввод чисел в обратном порядке.
     */
    val numbersLotteryRange = 0..42
    val wonNumberOne = 3
    val wonNumberTwo = 21

    println("Лотерея! Введите первое число в диапазоне $numbersLotteryRange")
    val numFirst = readln().toInt()
    println("Лотерея! Введите второе число в диапазоне $numbersLotteryRange")
    val numSecond = readln().toInt()
    val listEnteredNumbers = listOf(numFirst, numSecond)

    when {
        wonNumberOne in listEnteredNumbers && wonNumberTwo in listEnteredNumbers -> println("Поздравляем! Вы выиграли главный приз!")
        wonNumberOne in listEnteredNumbers || wonNumberTwo in listEnteredNumbers -> {
            println("Вы выиграли утешительный приз!")
            println("\"Счастливые\" числа в лотереи: $wonNumberOne и $wonNumberTwo")
        }

        else -> {
            println("Неудача!")
            println("\"Счастливые\" числа в лотереи: $wonNumberOne и $wonNumberTwo")
        }
    }
}
