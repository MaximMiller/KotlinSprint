package org.example.lesson_16

class Cube {
    private val randomValue = (1..9).random()
    fun diceValue() {
        println("Значение кубика:  $randomValue")
    }
}

fun main() {
    val dice = Cube()
    dice.diceValue()
}
/*
На игральном кубике может выпасть одно число от 1 до 6.

Создай класс кубика, в котором будет проинициализировано одно поле со случайным числом.
Единственный способ узнать это число – вызвать специальный метод, который напечатает информацию в консоль.
 */