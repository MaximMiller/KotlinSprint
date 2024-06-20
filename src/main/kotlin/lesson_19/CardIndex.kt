package org.example.lesson_19

enum class Gender(val genderName: String) {
    MALE("Мужской"),
    FEMALE("Женский")
}

// Класс для представления человека
data class Person(val name: String, val gender: Gender)

fun main() {
    // Инструкция для пользователя
    println("Введите имя и пол (MALE, FEMALE) через пробел. Например: Алексей MALE")

    val people = mutableListOf<Person>()

    // Цикл для ввода данных 5 человек
    repeat(5) {
        val input = readLine()!!.split(" ")
        val name = input[0]
        val gender = Gender.valueOf(input[1].toUpperCase())
        people.add(Person(name, gender))
    }

    // Вывод списка людей в консоль
    people.forEach { println("Имя: ${it.name}, Пол: ${it.gender.genderName}") }
}
/*
Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.

Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum.
После ввода 5 человек, список выводится в консоль.

При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).
 */