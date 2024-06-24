package org.example.lesson_21

fun String.vowelCount(): Int {
    val listVowel = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return this.count { it in listVowel }
}

fun main() {
    val str = "hello"
    println(str.vowelCount())

}
/*
Реализуй extension функцию для класса String, которая будет
возвращать количество гласных букв в строке. Назови функцию vowelCount.
Например, для строки "hello" функция должна вернуть 2.
 */