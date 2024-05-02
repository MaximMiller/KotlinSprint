package org.example.lesson_8

fun main() {
    /*
    Представь, что ты работаешь над приложением с рецептами (кстати, это приложение
    мы вместе будем разрабатывать на практике AndroidSprint). Напиши код, который проверяет,
    есть ли нужный ингредиент в рецепте.

 – создай массив, в котором будет храниться список ингредиентов для определенного блюда;
 – далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
 – произведи поиск элемента по массиву, используя цикл for;
 – если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент [название] в рецепте есть”;
 – если нет, сообщать: “Такого ингредиента в рецепте нет”.салат
     */
    val ingredientsSalad = arrayOf("помидор", "огурец", "перец", "соль", "сметана")
    println("Какой ингредиент Вы хотите найти?")
    var chooseUser = readln()
    for (i in ingredientsSalad) {
        if (ingredientsSalad.indexOf(chooseUser) in 0..ingredientsSalad.size) {
            println("Ингредиент $chooseUser в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
            chooseUser = readln()
        }
    }
}
