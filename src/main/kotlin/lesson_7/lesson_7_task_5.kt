package org.example.lesson_7

const val MIN_LENGTH_PASSWORD = 6

fun main() {/*
    Создай программу, которая генерирует более сложные пароли.
– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.
     */
    println("Генерируем сложный пароль - укажите длину:")
    var lengthPassword = readln().toInt()

    val listChar = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    var complexPasswords = ""

    while (true) {
        if (lengthPassword < MIN_LENGTH_PASSWORD) {
            println("Символов в пароле должно быть не меньше $MIN_LENGTH_PASSWORD")
            lengthPassword = readln().toInt()
        } else {
            for (i in 1..lengthPassword) {
                complexPasswords += listChar.random()
            }
            break
        }
    }
    println(complexPasswords)
}
