package org.example.lesson_18

abstract class Dice {
    abstract fun throwDice(): Int

    abstract fun printValueDice()
}

class DiceFourFacet : Dice() {
    private val countFacet = 4
    private var oneDice = 0

    override fun throwDice(): Int {
        oneDice = (1..countFacet).random()
        return oneDice
    }

    override fun printValueDice() {
        println("Значение кости $oneDice")
    }


}


class DiceSixFacet : Dice() {
    private val countFacet = 6
    private var oneDice = 0

    override fun throwDice(): Int {
        oneDice = (1..countFacet).random()
        return oneDice
    }

    override fun printValueDice() {
        println("Значение кости $oneDice")
    }
}

class DiceEightFacet : Dice() {
    private val countFacet = 8
    private var oneDice = 0
    override fun throwDice(): Int {
        oneDice = (1..countFacet).random()
        return oneDice
    }

    override fun printValueDice() {
        println("Значение кости $oneDice")
    }
}

fun main() {
    val diceFourFacet = DiceFourFacet()
    val diceSixFacet = DiceSixFacet()
    val diceEightFacet = DiceEightFacet()

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