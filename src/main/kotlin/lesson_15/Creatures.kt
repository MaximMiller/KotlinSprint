package org.example.lesson_15

interface Flying {
    fun fly() {
        println("Существо летает")
    }
}

interface Floating {
    fun swim() {
        println("Существо плавает")
    }
}


class FlyingCreatures(
    val name: String,
) : Flying


class FloatingCreatures(
    val name: String,
) : Floating


class Creatures(
    val name: String,
) : Flying, Floating


fun main() {
    val crucian = FloatingCreatures("Карась")
    println(crucian.name)
    crucian.swim()
    val gull = FlyingCreatures("Чайка")
    println(gull.name)
    gull.fly()
    val duck = Creatures("Утка")
    println(duck.name)
    duck.fly()
    duck.swim()

}
/*
В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.

- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.
 */