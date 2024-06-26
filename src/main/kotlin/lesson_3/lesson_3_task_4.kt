package org.example.lesson_3

fun main() {
    /*
    В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
    Игрок начал партию ходом из E2 в E4. Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.

 – Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль. Нужно "собрать"
 диную строку из объявленных переменных и сохранить в новую переменную (или сразу распечатывать).

 – Далее этим переменным нужно присвоить новые данные и вывести в консоль следующий ход белых. Определить,
  какое значение будет в переменной "куда" для фигуры, стоящей на D2 и продвинувшейся на одну клетку вперед.
     */

    var whence = "E2"
    var where = "E4"
    var numberProgress = 1
    var resultString = "$whence-$where;$numberProgress"
    println(resultString)

    whence = "D2"
    where = "D3"
    numberProgress = 3
    resultString = "$whence-$where;$numberProgress"
    println(resultString)
}