package org.example.lesson_20

class Robot {
    private var modifier: (String) -> String = { it }
    private val phrases = listOf(
        "Привет, как дела?",
        "Я робот, а не человек",
        "Мир, труд, май",
        "Кодирование - это весело",
        "Котлин - мой любимый язык программирования"
    )

    fun say() {
        val phrase = phrases.random()
        println(modifier(phrase))
    }

    fun setModifier(lambda: (String) -> String) {
        modifier = lambda
    }
}

fun main() {
    val robot = Robot()

    robot.say()

    robot.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot.say()
}
/*
Программируем робота. Робот умеет говорить и работать с модификаторами речи.
Речь реализуется методом say(). Модификатор устанавливается функцией setModifier(), принимающей лямбду.

Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
Реализуй модификатор, инвертирующий слова робота.

В результате в главной функции должен быть воспроизведен такой алгоритм:
– Вызов say(). Метод печатает одну фразу в обычном виде.
– Вызов setModifier(). Устанавливает переданный в него модификатор строки.
– Вызов say(). Метод выводит одну фразу в инвертированном виде.
 */