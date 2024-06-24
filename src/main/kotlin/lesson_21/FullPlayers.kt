package org.example.lesson_21


class FullPlayers(
    val namePlayer: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun FullPlayers.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val playerOne = FullPlayers("Ork", 10, 100)
    println("У игрока: ${playerOne.namePlayer} состояние здоровья: ${playerOne.isHealthy()} ")

}
/*
Создай класс игрока, который аналогичен классу Player из задания 20-2.
 Помимо имени у игрока должны быть поля с текущим и максимальным здоровьем.
 Предположим, что у нас нет возможности редактировать класс (нельзя добавлять новые функции в класс Player).

Требуется реализовать функцию-расширение isHealthy для этого класса,
которая будет возвращать true, если здоровье игрока равно максимальному здоровью, и false в противном случае.
 */