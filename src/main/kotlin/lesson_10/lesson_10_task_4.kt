package org.example.lesson_10

fun main() {
    /*
    Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости.
     Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю играть до тех пор
     пока ему не надоест. В конце программа должна вывести сколько партий он выиграл.

    - после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? Введите Да или Нет”;
    - программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества
    выигрышных партий человека;
    - в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
    - основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными.
     */
    var countWinsHuman = 0
    do {
        val progressHuman = valueDice()
        println("У человека выпало $progressHuman")
        val progressComputer = valueDice()
        println("У компьютера выпало $progressComputer")
        if (checkDice(progressHuman, progressComputer)) {
            countWinsHuman++
            println("Победил человек")
        } else {
            println("Победил компьютер")
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answerUser = readln()
    } while (answerUser.equals("да", ignoreCase = true))
    println("Человек победил $countWinsHuman раз")
}

fun valueDice(): Int {
    val intRange = 1..9
    return intRange.random()
}

fun checkDice(progressHuman: Int, progressComputer: Int): Boolean {
    return if (progressHuman > progressComputer) true else false
}
