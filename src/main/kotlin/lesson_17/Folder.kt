package org.example.lesson_17

class Folder(
    private val isSecret: Boolean,
    private val name: String,
    private val amountFiles: Int,
    ) {
    val folderName: String
        get() = if (isSecret) "скрытая папка" else name
    val folderAmountFiles: Int
        get() = if (isSecret) 0 else amountFiles

}

fun main() {
    val folderMain = Folder(true, "Документы", 32)
    println("Название: ${folderMain.folderName}\nКоличество файлов-${folderMain.folderAmountFiles}")
    println()
    val folderUser = Folder(false, "Загружено", 2)
    println("Название: ${folderUser.folderName}\nКоличество файлов-${folderUser.folderAmountFiles}")


}
/*
В приложении для хранения облачных файлов есть папки и файлы.

Создай класс папки, который имеет имя, количество файлов и флаг
“секретно”. Если флаг имеет значение true, то при попытке прочитать имя,
возвращать строку “скрытая папка” и количество файлов – 0. В ином случае возвращать ее
название и реальное количество файлов. Для реализации должны использоваться геттеры.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.
 */