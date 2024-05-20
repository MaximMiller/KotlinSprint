package org.example.lesson_13

class TelephoneDir(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printData() {
        println("Имя: $userName, Номер: $phoneNumber, Компания:$company")
    }
}

fun main() {
    val listContact = listOf(
        TelephoneDir("Max", 8953147569955, null),
        TelephoneDir("Fill", 8953147569955, "VK"),
        TelephoneDir("Bob", 8953147569955, "Sber"),
        TelephoneDir("Anna", 8953147569955, null),
        TelephoneDir("Li", 8953147569955, "null")
    )
    for (i in listContact) println(i.company)

}
/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.

- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.
 */