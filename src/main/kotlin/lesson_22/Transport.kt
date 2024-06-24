package org.example.lesson_22

data class Transport(
    val title: String,
    val color: String,
    val typesOfTransport: String,
)

fun main() {
    val transport = Transport("Самолет", "Белый", "Воздушный")
    val (title, color, typesOfTransport) = transport
    println("Название: $title,\nЦвет: $color,\nВид транспорта: $typesOfTransport")
}
/*
Используя любой data class, в котором есть минимум 3 свойства, выполни
деструктуризацию объекта на отдельные переменные и выведи их значения в консоль.
 */
