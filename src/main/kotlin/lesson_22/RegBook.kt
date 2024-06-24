package org.example.lesson_22

class RegBook(
    private val title: String,
    private val author: String,
)

data class DtBook(
    private val title: String,
    private val author: String,
)

fun main() {
    val regularBookOne = RegBook("Сказки", "Пушкин")
    println(regularBookOne)
    /*
    org.example.lesson_22.RegBook@6f496d9f - распечатывается Название класса и хэш код
    тк метод toString() не переопределен
     */
    val dataBookOne = DtBook("Сказки", "Пушкин")
    println(dataBookOne)
    /*
      DtBook(title=Сказки, author=Пушкин)
      тк в data классе переопределен метод  toString() и в стандартной реализации распечатка
      объекта и всех его свойств
     */

}
/*
Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

Создай по одному экземпляру каждого класса и выведи их в консоль (объект целиком).
Объясни разницу в выводе, используя комментарий в коде.
 */