package lesson_6


fun main() {
    /*
      Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
      Игроку дается 5 попыток, чтобы угадать это число.

    – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
    – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
    – после истечения попыток выводится сообщение “Было загадано число N”.
     */
    val wonNumber = 2
    val numbersRange = 1..9
    var attemptsCount = 5

    println("Угадайте число в промежутке $numbersRange\nВам дается $attemptsCount попыток!\nВведите число:")
    var chooseUserNumber = readln().toInt()

    while (true) {
        if (chooseUserNumber !in numbersRange) {
            println("Число должно находитсья в промежутке $numbersRange! Введите еще раз:")
            chooseUserNumber = readln().toInt()
        } else {
            break
        }
    }

    while (attemptsCount > 1) {
        attemptsCount--
        if (chooseUserNumber == wonNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно. Осталось попыток: $attemptsCount")
            chooseUserNumber = readln().toInt()
        }
    }
    println("Было загадано число $wonNumber")
}
