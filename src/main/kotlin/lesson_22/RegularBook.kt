package org.example.lesson_22

class RegularBook(
    private val title: String,
    private val author: String,
)

data class DataBook(
    private val title: String,
    private val author: String,
)

fun main() {
    val regularBookOne = RegularBook("Сказки", "Пушкин")
    val regularBookTwo = RegularBook("Сказки", "Пушкин")
    val dataBookOne = DataBook("Сказки", "Пушкин")
    val dataBookTwo = DataBook("Сказки", "Пушкин")

    println(regularBookOne == regularBookTwo)//false
    /*
    Тк нет ovveraйда метода equals() сравнения идет по ссылки на объект а она разная
     */
    println(dataBookOne == dataBookTwo)//true
    /*
    в data классе equals() переопределен так чтобы сравнение было по значению объекта
     */
}

/*
Создай обычный класс RegularBook и data class DataBook, каждый из которых содержит два свойства: название и автор.

Создай по два экземпляра каждого класса с одинаковыми свойствами, а затем сравни их (экземпляры),
используя оператор сравнения.

Выведи результат сравнения в консоль для каждой пары объектов. Объясни разницу в выводе, используя комментарий в коде.
 */