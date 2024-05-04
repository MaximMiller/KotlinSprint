package org.example.lesson_7

const val MIN_LENGTH_PASSWORD = 6
const val NUM_OF_REQUIRED_CHAR = 3

fun main() {/*
    Создай программу, которая генерирует более сложные пароли.
– пароль должен содержать цифры, строчные и ЗАГЛАВНЫЕ БУКВЫ - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.
     */
    val intRange = '0'..'9'
    val charRange = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val allChar = intRange + charRange + capitalLetters
    val listComplexPasswords = mutableListOf(intRange.random(), charRange.random(), capitalLetters.random())

    println("Генерируем сложный пароль - укажите длину:")
    var lengthPassword = readln().toInt()

    if (lengthPassword < MIN_LENGTH_PASSWORD) {
        lengthPassword = MIN_LENGTH_PASSWORD
    }
    for (i in NUM_OF_REQUIRED_CHAR until lengthPassword) {
        listComplexPasswords.add(allChar.random())
    }
    listComplexPasswords.shuffle()
    println(listComplexPasswords.toCharArray())
}
