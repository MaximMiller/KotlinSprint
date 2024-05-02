package org.example.lesson_8

fun main() {
    /*
    Используй условие из предыдущей задачи.
    Нужно доработать код, который проверяет наличие ингредиента в рецепте.
    Однако, не используя цикл для поиска.
     */
    val ingredientsSalad = arrayOf("помидор", "огурец", "перец", "соль", "сметана")

    println("Какой ингредиент Вы хотите найти?")
    var chooseUser = readln()

    if (ingredientsSalad.contains(chooseUser)) {
        println("Ингредиент $chooseUser в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
