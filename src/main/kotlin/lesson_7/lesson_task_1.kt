package org.example.lesson_7

fun main() {
    /*
    Создай программу, которая генерирует шестизначные пароли. Пусть пароль
    будет состоять из чередующихся цифр и строчных букв латинского алфавита
    (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.
     */

    val rangeInt = 1..9
    val rangeChar = 'a'..'z'
    val listResult = mutableListOf<String>()
    var strResult = ""

    for (i in 1..6) {
        val numbersRandom = rangeInt.random().toString()
        val charRandom = rangeChar.random().toString()
        listResult.add(numbersRandom)
        listResult.add(charRandom)
        strResult += listResult[i]
    }
    println(strResult)

}