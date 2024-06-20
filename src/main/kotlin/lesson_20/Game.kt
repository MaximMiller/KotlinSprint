package org.example.lesson_20


class Player(
    val hasKey: Boolean,
)

val checkForKey: (Player) -> Unit = { player: Player ->
    if (player.hasKey) {
        println("Дверь открыта")
    } else {
        println("Дверь заперта")
    }
}

fun main() {
    val playerOne = Player(false)
    val playerTwo = Player(true)
    checkForKey(playerOne)
    checkForKey(playerTwo)
}

/*
В игре есть запертая дверь. Игрок должен найти ключ. Нужно написать
лямбда-функцию, которая будет проверять, есть ли у игрока ключ. Если ключ есть,
нужно вывести сообщение, что игрок дверь открыл, иначе – что дверь заперта.

Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа
 */