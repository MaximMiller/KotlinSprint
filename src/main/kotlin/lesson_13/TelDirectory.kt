package org.example.lesson_13

class TelDirectory(
    val userName: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printData() {
        println("Имя: $userName\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }

}

fun main() {
    val contact = TelDirectory("Max", 89523695212, null)
    contact.printData()
}
/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.

Дополни класс методом, который будет печатать информацию о контакте сообщением в одном
 println() и без использования многострочного ввода такого типа (пример):

- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit

Вместо null значения, в консоль должна выводиться строка <не указано>.
 */