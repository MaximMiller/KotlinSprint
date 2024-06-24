package org.example.lesson_20

class Players(
    val namePlayer: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

val healing: (Players) -> Unit = { player: Players -> player.currentHealth = player.maxHealth }

fun main() {
    val playerOne = Players("Ork", 10, 100)
    healing(playerOne)
    println("${playerOne.namePlayer} теперь имеет здоровье: ${playerOne.currentHealth} из ${playerOne.maxHealth}")

}
/*
В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает
всё его здоровье. Для реализации программы понадобится создать простой класс игрока
(у него должно быть имя, текущее и максимальное здоровье).

– Напиши лямбда-функцию с явным указанием типа переменной, реализующую лечебное зелье.
Функция должна принимать в качестве параметра объект игрока.
– Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.
 */