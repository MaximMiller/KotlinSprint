package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("Сумма четных чисел в списке: ${numbers.evenNumbersSum()}")
}
/*
Создай extension функцию evenNumbersSum для списка чисел, которая будет возвращать сумму всех четных чисел в списке.
 */