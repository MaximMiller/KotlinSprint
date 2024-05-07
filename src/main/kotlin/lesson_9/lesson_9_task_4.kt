package org.example.lesson_9

fun main() {
    /*
    Напиши программу, которая один раз запрашивает у пользователя пять
    названий ингредиентов блюда в одной строке, разделяя их запятыми (с пробелом).

    - запроси у пользователя 5 ингредиентов, перечисленных через “, ” (запятая с пробелом)
     и сохрани их в список, где каждый ингредиент — отдельный элемент;
    - отсортируй полученный список по алфавиту и выведи его в консоль;
    - используй тот метод сортировки, который возвращает новую отсортированную коллекцию.
     */
    println("Запишите 5 ингредиентов, перечисленных через “, ” (запятая с пробелом)")
    val dishIngredients = readln().split(", ")
    val sortListIngredients = dishIngredients.sorted()

    println("Отсортированный список по алфавиту  $sortListIngredients")
}