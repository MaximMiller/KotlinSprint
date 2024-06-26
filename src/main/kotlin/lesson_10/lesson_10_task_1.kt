package org.example.lesson_10

const val MAX_RANDOM_NUMBER = 6
fun main() {
    /*
    Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
     Побеждает выбросивший наибольшее число.

    - поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
    - бросить кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
    - в отдельные переменные сохрани результат работы функции для игрока и компьютера;
    - после сравнения результатов, выведи соответствующее сообщение в консоль.
    Например: "Победило человечество" или "Победила машина".
     */
    val playersProgress = rollTheDice()
    println("Ход игрока, выпало $playersProgress")
    val computerProgress = rollTheDice()
    println("Ход компьютера, выпало $computerProgress")

    if (playersProgress > computerProgress) {
        println("Победило человечество")
    } else {
        println("Победила машина")
    }

}

fun rollTheDice(): Int {
    val rangeRandomNumbers = 1..MAX_RANDOM_NUMBER
    val diceOne = rangeRandomNumbers.random()
    val diceTwo = rangeRandomNumbers.random()
    val resultRollTheDice = diceOne + diceTwo
    return resultRollTheDice
}
