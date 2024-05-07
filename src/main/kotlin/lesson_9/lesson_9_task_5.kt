package org.example.lesson_9

fun main() {
    /*
    Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

    - результат должен исключать повторы;
    - список должен выводиться в алфавитном порядке;
    - все элементы списка выведены в одну строку, разделяя слова запятыми;
    - первый элемент должен быть распечатан с заглавной буквы.
     */
    val dishIngredients = mutableListOf<String>()

    for (i in 0 until 5) {
        println("Введите ингредиент:")
        dishIngredients.add(readln())
    }
    val sortNoRepetitionList = dishIngredients.toSet().sorted().toMutableList()
    val firstElement = sortNoRepetitionList.first().uppercase()
    sortNoRepetitionList[0] = firstElement

    println("Список: без повторов, сортированный, первый элемент в верхнем регистре $sortNoRepetitionList")
}
