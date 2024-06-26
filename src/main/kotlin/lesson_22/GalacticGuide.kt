package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Земле звездная система, состоящая из трех звезд",
        LocalDateTime.of(2024, 6, 24, 21, 15),
        4.37
    )

    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата и время события: ${alphaCentauri.component3()}")
    println("Расстояние от Земли: ${alphaCentauri.component4()} световых лет")
}
/*
В Путеводитель для путешествующих автостопом по Галактике добавляется информация о
месте или событии в галактике в виде объектов.

Создай data class GalacticGuide cо свойствами:

- название места или события;
- описание места или события;
- дата и время события;
- расстояние места или события от Земли в световых годах.

Создай объект с информацией о звездной системе Alpha Centauri.
Выведи информацию о месте, используя компонентные функции data class.
 */