package org.example.lesson_14

open class Ship(
    private val name: String = "Liner",
    private val numberOfPassenger: Int = 100,
    private val speed: Int = 100,
    private val loadingCapacity: Int = 0,
) {
    fun printData() {
        println(
            "Название транспорта: $name\nКоличество пассажиров: $numberOfPassenger\nСкорость: $speed\n"
                    + "Грузоподъемность: $loadingCapacity"
        )
    }

    open fun loadingMethod() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip(
    name: String = "Cargo",
    speed: Int = 60,
    numberOfPassenger: Int = 3,
    loadingCapacity: Int = 25,
) : Ship(name, numberOfPassenger, speed, loadingCapacity) {
    override fun loadingMethod() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class IcebreakerShip(
    name: String = "Icebreaker",
    speed: Int = 50,
    numberOfPassenger: Int = 2,
    loadingCapacity: Int = 12,
) : Ship(name, numberOfPassenger, speed, loadingCapacity) {
    fun crushIce() {
        println("Функция колоть лед")
    }

    override fun loadingMethod() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val cargo = CargoShip()
    cargo.printData()
    cargo.loadingMethod()
    val liner = Ship()
    liner.printData()
    liner.loadingMethod()
    val icebreaker = IcebreakerShip()
    icebreaker.printData()
    icebreaker.crushIce()
    icebreaker.loadingMethod()
}/*
Каждый тип корабля обладает уникальным способом погрузки:

- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.

Реализуй методы погрузки, специфичные для каждого вида корабля.

Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.
 */