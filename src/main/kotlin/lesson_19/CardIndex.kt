package org.example.lesson_19

enum class Gender(val genderName: String) {
    MALE("Мужской"),
    FEMALE("Женский")
}

data class Person(val name: String, val gender: Gender)

fun main() {
    println("Введите имя и пол (MALE, FEMALE) через пробел. Например: Алексей MALE")

    val people = mutableListOf<Person>()

    for (i in 1..5) {
        val input = readln().split(" ")
        val name = input[0]
        val gender: Gender = Gender.valueOf(input[1].uppercase())
        people.add(Person(name, gender))
    }

    people.forEach { println("Имя: ${it.name}, Пол: ${it.gender.genderName}") }
}
/*
Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.

Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum.
После ввода 5 человек, список выводится в консоль.

При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).
 */