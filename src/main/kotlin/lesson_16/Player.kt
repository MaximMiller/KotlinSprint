package org.example.lesson_16

class Player(
    private val nickName: String,
) {
    private var health: Int = 100
    private var forceAttack: Int = 50

    private fun death() {
        health = 0
        forceAttack = 0
    }

    fun getDamage(attack: Int) {
        if (health <= 0) {
            death()
        } else {
            health -= attack
        }
    }

    fun treat(tablet: Int) {
        if (health <= 0) {
            death()
        } else {
            health += tablet
        }
    }

    override fun toString(): String {
        return "Имя: $nickName, Здоровье: $health, Сила удара: $forceAttack"
    }
}

fun main() {
    val player = Player("IronMan")
    player.getDamage(50)
    player.treat(10)
    player.getDamage(50)
    println(player)
    player.getDamage(50)
    println(player)
    player.treat(20)
    println(player)

}
/*
Для игры требуется создать класс игрока. С полями: имя, здоровье и сила удара.
Здоровье должно изменяться только через методы получить урона и лечить.

Добавить приватный метод, который вызывается, если при получении урона заканчивается
здоровье. Смерть обнуляет силу удара, здоровье и не позволяет лечиться.

Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.
 */