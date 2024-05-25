package org.example.lesson_15

abstract class Goods(
    val title: String,
    val amountStorage: Int,
)

class Tools(title: String, amountStorage: Int) : Goods(title, amountStorage)


class Components(title: String, amountStorage: Int) : Goods(title, amountStorage), Search {
    override fun searchComponent() {
        println("«Выполняется поиск»")
    }
}

interface Search {
    fun searchComponent()
}

fun main() {
    val guitar = Tools("Гитара", 3)
    val string = Components("Струна", 500)
    string.searchComponent()
}
/*
На сайте музыкального магазина есть товары двух категорий:
инструменты и комплектующие к ним. Все товары имеют название и количество единиц на складе.

Для инструментов есть возможность поиска соответствующих комплектующих.

Опиши классы для категорий товаров. Имитируй процесс поиска текстовым
сообщением «Выполняется поиск». Для выноса логики поиска используй интерфейс.
 */