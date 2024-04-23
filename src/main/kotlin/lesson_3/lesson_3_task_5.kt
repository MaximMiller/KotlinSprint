package org.example.lesson_3

fun main() {
    /*
    Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера,
    которая примет строку, отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

    Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода, присвоить
    соответствующим переменным и распечатать по отдельности.
     */

    val resultString = "D2-D4;0"
    val res = resultString.split("-", ";")
    val whence = res[0]
    val where = res[1]
    val numberProgress = res[2]

    println(whence)
    println(where)
    println(numberProgress)
}