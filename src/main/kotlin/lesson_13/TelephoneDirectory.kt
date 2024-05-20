package org.example.lesson_13

class TelephoneDirectory(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val contact = TelephoneDirectory("Max", 89523695212, null)
}

/*
Для программы телефонного справочника создай класс, который будет хранить имя,
номер телефона и компанию. Номер телефона – целочисленное значение (Long).

При создании объекта компания может оставаться незаполненной. Вместо пустой
строки поле может принимать null.

Все свойства класса не должны иметь инициализации по умолчанию.
 */