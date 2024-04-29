package lesson_6

fun main() {
    /*
      Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
      Игроку дается 5 попыток, чтобы угадать это число.

    – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
    – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
    – после истечения попыток выводится сообщение “Было загадано число N”.
     */
    val numbersRange = 1..9
    val wonNumber = numbersRange.random()
    println("win number  $wonNumber")
    var attemptsCount = 5

    do {
        println("Угадайте число в промежутке $numbersRange\nВведите число:")
        val chooseUserNumber = readln().toInt()
        attemptsCount--
        if (chooseUserNumber == wonNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно. Осталось попыток: $attemptsCount")
        }
    } while (attemptsCount > 0)

    println("Было загадано число $wonNumber")
}
