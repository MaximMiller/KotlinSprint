@file:Suppress("ktlint:standard:filename")

package org.example.lesson_5

fun main() {
    /* Нужно написать часть модуля для авторизации пользователя.
    Для входа в приложение пользователь должен доказать, что он не бот. Для этого программа предлагает решить простой
    математический пример – сложить два числа (сообщить об этом пользователю). второй компонент проверки на бота
    Имитируй эти действия в консоли, путем считывания данных с клавиатуры. При успешном решении вход в программу
    символизируется сообщением “Добро пожаловать!". В противном случае вывести сообщение "Доступ запрещен." */
    val firstComponentCheckingForBot = 2
    val secondComponentCheckingForBot = 2

    println(
        "Пожалуйста решите простой математический пример. Укажите результат вычисления: " +
            "$firstComponentCheckingForBot + $secondComponentCheckingForBot",
    )
    val resultCheckingForBot = readln().toInt()
    if (resultCheckingForBot == firstComponentCheckingForBot + secondComponentCheckingForBot) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
