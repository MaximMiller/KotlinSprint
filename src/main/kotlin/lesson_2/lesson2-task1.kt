package org.example.lesson_2


fun main() {
    /*
    Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека. У них следующие баллы
    по профильному предмету 3, 4, 3, 5. Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.

 – Написать выражение, которое высчитывает средний балл;
 – Распечатать результат в консоль;
 – В консоли должно быть выведено дробное число с 2 знаками после запятой.
     */
    val scorePersonOne = 3
    val scorePersonTwo = 4
    val scorePersonThird = 3
    val scorePersonFour = 5

    val amountPerson = 4
    val averageScore = (scorePersonOne + scorePersonTwo + scorePersonThird + scorePersonFour) / amountPerson.toDouble()
    println("Средний бал класса $averageScore")

    val allScoreClass = arrayOf(3, 4, 3, 5)
    println("Средний бал класса ${calculatesTheAverageScore(allScoreClass)}")
}

fun calculatesTheAverageScore(array: Array<Int>): Double {
    val amountScore = array.size
    var sumScore = 0.0
    for (score in array) {
        sumScore += score
    }
    return sumScore / amountScore
}