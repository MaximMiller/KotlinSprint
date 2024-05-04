package org.example.lesson_8

fun main() {
    /*
    Напиши программу, которая должна создавать массив из
    определенного количества ингредиентов, которые будет вводить пользователь.

- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.
     */
    println("Введите количество планируемых ингредиентов:")
    val countIngredients = readln().toInt()

    println("Введите названия ингредиентов:")
    val namesIngredients = arrayOfNulls<String>(countIngredients)

    for (i in 0 until countIngredients) {
        val chooseIngredient = readln()
        namesIngredients[i] = chooseIngredient
    }
}
