package org.example.lesson_17

class Ship(
    nameShip: String,
    averageSpeed: Int,
    homePort: String,
) {
    var nameShip = nameShip
        get() = field
        set(value) = println("Имя корабля менять нельзя")
    var averageSpeed = averageSpeed
        get() = field
        set(value) {
            field = value
        }
    var homePort = homePort
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Название: $nameShip\nСредняя скорость: $averageSpeed\nПорт прописки:$homePort"
    }

}

fun main() {
    val ship = Ship("BlackPearl", 32, "Moscow")
    println(ship)
    ship.nameShip = "Nautilus"
    ship.averageSpeed = 100
    ship.homePort = "NY"
    println()
    println(ship)
}

/*
Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.

Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.

Создай экземпляр класса и протестируй работу.
 */