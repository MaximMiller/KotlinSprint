package org.example.lesson_7

const val MIN_LENGTH_PASSWORD = 6

fun main() {/*
    Создай программу, которая генерирует более сложные пароли.
– пароль должен содержать цифры, строчные и ЗАГЛАВНЫЕ БУКВЫ - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.
     */
    println("Генерируем сложный пароль - укажите длину:")
    val lengthPassword = readln().toInt()

    val listChar = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    val intRange = '0'..'9'
    val charRange = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    var complexPasswords = ""

    if (lengthPassword < MIN_LENGTH_PASSWORD) {
        for (i in 1..MIN_LENGTH_PASSWORD) {
            complexPasswords += intRange.random()
            complexPasswords += charRange.random()
            complexPasswords += capitalLetters.random()
            complexPasswords += listChar.random()
        }
    } else {
        for (i in 1..lengthPassword) {
            complexPasswords += listChar.random()
            complexPasswords += intRange.random()
            complexPasswords += charRange.random()
            complexPasswords += capitalLetters.random()
        }
    }
    println(complexPasswords)
}
