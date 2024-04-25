package org.example.lesson_5

fun main() {
    /*
 Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42. Пользователь вводит числа через консоль.

Требования к программе:

- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.

В зависимости от количества угаданных чисел программа выводит результат:

- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа.
     */
    val numbersLotteryRange = 0..42
    val wonNumberOne = numbersLotteryRange.random()
    val wonNumberTwo = numbersLotteryRange.random()
    val wonNumberThree = numbersLotteryRange.random()
    val setWonNumbers = mutableSetOf(wonNumberOne, wonNumberTwo, wonNumberThree)
    val setNumUserChoice = mutableSetOf<Int>()

    println("Лотерея! Введите первое число в диапазоне $numbersLotteryRange")
    val numFirstChoice = readln().toInt()
    setNumUserChoice.add(numFirstChoice)
    println("Лотерея! Введите второе число в диапазоне $numbersLotteryRange")
    val numSecondChoice = readln().toInt()
    setNumUserChoice.add(numSecondChoice)
    println("Лотерея! Введите третье число в диапазоне $numbersLotteryRange")
    val numThreeChoice = readln().toInt()
    setNumUserChoice.add(numThreeChoice)

    val resultLottery = setNumUserChoice.intersect(setWonNumbers)
    val sizeOfTheResultingCollection = resultLottery.size // Тк в ТЗ есть пункт иначе resultLottery.size сразу в аргумент when
    when (sizeOfTheResultingCollection) {
        3 -> println("Поздравляем! Вы угадали все числа! Получаете джекпот")
        2 -> println("Поздравляем! Вы угадали два числа! Получаете крупный приз")
        1 -> println("Поздравляем! Вы угадали одно число! Получаете утешительный приз")
        else -> println("Вы не угадали ни одного числа. Пробуйте еще раз - попытки не ограничены!")
    }
    println("В лотереи победили числа $setWonNumbers")
}
