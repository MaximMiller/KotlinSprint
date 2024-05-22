package org.example.lesson_13

class BookPhone(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
) {

    fun printData() {
        println("Имя: $userName, Номер: $phoneNumber, Компания: $company")
    }
}

fun main() {
    try {
        val phone = readln().toLong()
        println(phone)
    } catch (e: NumberFormatException) {
        println("NumberFormatException")

    }
}
/*
Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги)
 и измени его название для избегания конфликтов.

Для получения номера программа считывает ввод пользователя с типом String
по умолчанию. Приведи строку к типу Long. Если пользователь ввел что-либо, кроме цифр — программа падает.

Необходимо избежать падения программы при попытке приведения строки к типу
 Long. Отлови ошибку и выведи ее название в консоль.
 */