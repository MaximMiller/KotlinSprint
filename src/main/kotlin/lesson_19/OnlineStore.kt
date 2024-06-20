package org.example.lesson_19

enum class Category {
    CLOTHES,
    STATIONERY,
    SUNDRY;

    fun returnNameOfCategory() =
        when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            SUNDRY -> "Разное"
        }
}

class Product(
    private val title: String,
    private val id: Int,
    private val category: Category,
) {
    fun infoProduct() {
        println("Название: $title, ID: $id, Категория: ${category.returnNameOfCategory()}")
    }
}

fun main() {
    val shirt = Product("Футболка", 1, Category.CLOTHES)
    shirt.infoProduct()

    val pen = Product("Ручка", 2, Category.STATIONERY)
    pen.infoProduct()

    val mug = Product("Кружка", 3, Category.SUNDRY)
    mug.infoProduct()
}
/*
В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.

 – создай enum класс с категориями;
 – создай метод внутри enum, который вернет текстовое название категории
 для пользователя;
 – создай класс, описывающий товар (с полями название, id, категория),
 в классе должен быть метод, который выводит инфо о товаре. Вызови его для нескольких созданных товаров;
 – для вывода информации о товаре, для категории используй метод определения категории.
 */