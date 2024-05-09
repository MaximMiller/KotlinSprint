package org.example.lesson_10

fun main() {
    /*
    Напиши программу, которая генерирует пароли. Пароль должен состоять
    из последовательно чередующихся цифр и специальных символов. Например, 4#4%2!.
    - пользователь сам задает длину пароля;
    - для генерации пароля должна быть отдельная функция, принимающая целочисленное
     значение длины пароля и возвращающая готовый пароль;
    - пароль должен содержать цифры от 0 до 9,
    специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).
     */
    println("Для генерации длины пароля введите длину:")
    val passwordLength = readln().toInt()
    generatePassword(passwordLength)
}

fun generatePassword(length: Int): String {
    val intRange = '0'..'9'
    val specialSymbols = arrayOf(
        "!",
        "\"",
        "#",
        "$",
        "%",
        "&",
        "'",
        "(",
        ")",
        "*",
        "+",
        ",",
        "-",
        ".",
        "/",
        " "
    )

    var resultPassword = ""
    for (i in 1..length - 2) {
        resultPassword += intRange.random()
        resultPassword += specialSymbols.random()
    }
    return resultPassword
}
