package org.example.lesson_7


fun main() {
    /*
    Создай программу, которая генерирует шестизначные пароли. Пусть пароль
    будет состоять из чередующихся цифр и строчных букв латинского алфавита
    (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.
     */

    val rangeInt = 0..9
    val numberOfCharacters = 1..3
    val rangeChar = 'a'..'z'
    var strResult = ""

    for (i in numberOfCharacters) {
        val numbersRandom = rangeInt.random().toString()
        val charRandom = rangeChar.random().toString()
        strResult += numbersRandom
        strResult += charRandom
    }
    println(strResult)
}
