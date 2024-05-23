package org.example.lesson_14

open class Liner(
    val name: String = "Liner",
    val numberOfPassenger: Int = 100,
    val speed: Int = 100,
    val loadingCapacity: Int = 0
) {
    fun printData() {
        println(
            "Название транспорта: $name\nКоличество пассажиров: $numberOfPassenger\nСкорость: $speed\n" +
                    "Грузоподъемность: $loadingCapacity"
        )
    }
}

class Cargo(
    name: String = "Cargo",
    speed: Int = 60,
    numberOfPassenger: Int = 3,
    loadingCapacity: Int = 25,
) : Liner(name, numberOfPassenger, speed, loadingCapacity)

class Icebreaker(
    name: String = "Icebreaker",
    speed: Int = 50,
    numberOfPassenger: Int = 2,
    loadingCapacity: Int = 12,
) : Liner(name, numberOfPassenger, speed, loadingCapacity) {
    fun crushIce() {
        println("Функция колоть лед")
    }
}

fun main() {
    val cargo = Cargo()
    cargo.printData()
    val liner = Liner()
    liner.printData()
    val icebreaker = Icebreaker()
    icebreaker.printData()
    icebreaker.crushIce()
}
/*
В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол.
Все корабли построены на основе лайнера, но у каждого свой функционал и дополнительные свойства.

У грузовых скорость меньше, а грузоподъемность больше. У ледоколов ниже и
скорость, и вместительность, но они могут колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.

- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
- создай по 1 экземпляру каждого типа корабля.
 */