package org.example.lesson_17

class Folder(
    isSecret: Boolean = true,
    private val name: String = "Скрытая папка",
    private val amountFiles: Int = 0,

    ) {
    var isSecret = isSecret
        get() {
            if (field) {
                println("Название: $name\nКоличество файлов-$amountFiles")
            }
            return field
        }
}

fun main() {
    val folder = Folder(false)
    println(folder.isSecret)

}
/*
В приложении для хранения облачных файлов есть папки и файлы.

Создай класс папки, который имеет имя, количество файлов и флаг
“секретно”. Если флаг имеет значение true, то при попытке прочитать имя,
возвращать строку “скрытая папка” и количество файлов – 0. В ином случае возвращать ее
название и реальное количество файлов. Для реализации должны использоваться геттеры.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.
 */