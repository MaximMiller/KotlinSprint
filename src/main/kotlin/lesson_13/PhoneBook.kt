package org.example.lesson_13

class PhoneBook(
    val userName: String,
    val phoneNumber: Long?,
    val company: String?,
) {

    fun printData() {
        println("Имя: $userName, Номер: $phoneNumber, Компания: $company")
    }
}

fun main() {
    println("Сколько контактов планируте добавить?")
    val countContact = readln().toInt()
    val phoneBook = mutableListOf<PhoneBook>()
    var count = 0
    while (count < countContact) {
        println("Введите имя:")
        val name = readln()
        println("Введите телефон:")
        val phone = readln().toLongOrNull()
        if (phone == null) {
            println("Номер телефона не указан. Контакт не добавлен.")
            return
        }

        println("Введите компанию:")
        var company: String? = readln()
        if (company == "") {
            company = null
        }

        val contact = PhoneBook(name, phone, company)
        phoneBook.add(contact)

        count++
    }
    phoneBook.forEach { it.printData() }

}
/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).

- если пользователь не ввел номер телефона, то нужно уведомить об этом
пользователя и такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- если пользователь не заполнил компанию, то в объект записывать null.

Выведи созданные объекты в консоль методом класса.

 */