package org.example.lesson_19

enum class Aquarium {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println(Aquarium.entries.joinToString { it.name })
}

/*
В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
 петушок (Siamese fighting fish).
 Напиши enum класс, перечисляющий этих рыб. Сообщи пользователю, каких рыб он может добавить в свой
  аквариум, распечатав список в консоль.
 */