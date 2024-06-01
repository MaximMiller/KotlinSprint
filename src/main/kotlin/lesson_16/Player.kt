package org.example.lesson_16

private const val MAX_VALUE_TABLET = 100
private const val MAX_VALUE_ATTACK = 100
private const val MAXIMUM_HEALTH_LEVEL = 100

class Player(
    private val nickName: String,
) {
    private var isAlive = true
    private var health: Int = 100
    private var forceAttack: Int = 50

    private fun death() {
        if (isAlive) {
            forceAttack = 0
            health = 0
            isAlive = false
            println("$nickName умер и больше не может быть исцелен или получать урон.")
        }
    }

    fun getDamage(attack: Int) {
        if (isAlive) {
            health -= attack.coerceAtMost(MAX_VALUE_ATTACK)
            if (health <= 0) {
                death()
            }
        }
    }

    fun treat(tablet: Int) {
        if (isAlive && tablet <= MAXIMUM_HEALTH_LEVEL) {
            health += tablet.coerceAtMost(MAX_VALUE_TABLET)
        } else {
            println("Невозможно вылечить игрока на более чем 100%")
        }
    }

    override fun toString(): String {
        return "Имя: $nickName, Здоровье: $health, Сила удара: $forceAttack"
    }
}

fun main() {
    val player = Player("IronMan")
    player.getDamage(99)
    println(player)
//    player.treat(10)
//    println(player)
    player.treat(101)
    println(player)
}
/*
Для игры требуется создать класс игрока. С полями: имя, здоровье и сила удара.
Здоровье должно изменяться только через методы получить урона и лечить.

Добавить приватный метод, который вызывается, если при получении урона заканчивается
здоровье. Смерть обнуляет силу удара, здоровье и не позволяет лечиться.

Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.
 */