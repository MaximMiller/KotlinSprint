package org.example.lesson_18

abstract class Dice {
    abstract val countFacet: Int
    private var valueDice = 0
    open fun throwDice(): Int {
        val oneDice = (1..countFacet).random()
        val twoDice = (1..countFacet).random()
        valueDice = oneDice + twoDice
        return valueDice
    }

    open fun printValueDice() {
        println("Общее значение костей $valueDice")
    }
}

class DiceFourFacet(override val countFacet: Int) : Dice()

class DiceSixFacet(override val countFacet: Int) : Dice()

class DiceEightFacet(override val countFacet: Int) : Dice()


fun main() {
    val diceFourFacet = DiceFourFacet(4)
    val diceSixFacet = DiceSixFacet(6)
    val diceEightFacet = DiceEightFacet(8)

    val listDice = listOf<Dice>(diceFourFacet, diceSixFacet, diceEightFacet)
    listDice.forEach { it.throwDice() }.also { listDice.forEach { it.printValueDice() } }

}/*
В игре используются типы игральных костей с разным количеством граней: четыре, шесть и восемь.

Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен
быть метод, бросить кость и напечатать значение в консоль.

Для демонстрации полиморфизма “включения”:

- создай несколько объектов с разными гранями;
- собери из них список объектов, указав тип списка;
- выполни итерацию по списку и вызови у каждого объекта метод броска кости.
 */