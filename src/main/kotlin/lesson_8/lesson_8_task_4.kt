package org.example.lesson_8

import java.util.Arrays

fun main() {
    /*
    Представим, что мы получили массив ингредиентов. Программа должна распечатать
    весь список ингредиентов, затем заменить нужный ингредиент на новый по желанию пользователя.
    После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”
     */
    val ingredientsSalad = arrayOf("помидор", "огурец", "перец", "соль", "сметана")
    println("Список ингредиентов: ${ingredientsSalad.contentToString()}")
    println("Введите название инредиента, который хотите заменить")
    val chooseIngredient = readln()

    if (chooseIngredient in ingredientsSalad) {
        val index = ingredientsSalad.indexOf(chooseIngredient)
        println("Отлично! Введите название инредиента, который хотите добавить")
        val replaceIngredient = readln()
        ingredientsSalad[index] = replaceIngredient
        println("Готово! Вы сохранили следующий список: ${ingredientsSalad.contentToString()}")
    } else if (chooseIngredient !in ingredientsSalad) {
        println("Ингредиент не найден!")
    }
}
