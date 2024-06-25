package org.example.lesson_21

import java.io.File
import java.util.*


fun File.writeWord(text: String) {
    val currentText = this.readText()
    this.writeText(text.lowercase() + "\n" + currentText)
}

/*
В курсовой работе мы разрабатываем телеграм-бота на Kotlin, который помогает
пользователям учить иностранные слова. Создай extension функцию для класса File из
стандартной библиотеки, которая будет записывать переданное ей слово в файл.

- дополнительные материалы про файлы есть в 1-2 этапах курсовой;
- функция-расширение должна записывать текст в нижнем регистре;
- функция-расширение должна записывать текст в начало файла.
 */