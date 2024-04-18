package org.example.lesson_2

const val TOTAL_PERCENT = 100

fun main() {/*
    Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
    Используя формулу сложных процентов (ее можно загуглить), нужно посчитать размер вклада через 20 лет с такими условиями:
 – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и проинициализировать переменную);
 – Процентная ставка 16,7% (проценты начисляются в конце года);
 – Подсчитать размер вклада через 20 лет;
 – Результат должен быть дробным числом с 3 знаками после запятой;
 – Ответ должен получиться таким 1536438.428.
     */

    val sumDeposit = 70_000
    val interestRate = 16.7
    val bestBeforeYear = 20

    println(
        "Ваш размер депозита через $bestBeforeYear лет будет равен ${
            "%.3f".format(
                calculationTotalDepositAmountOverTime(
                    sumDeposit, interestRate, bestBeforeYear
                )
            )
        } рублей"
    )
}

fun calculationTotalDepositAmountOverTime(sumDeposit: Int, interestRate: Double, bestBefore: Int): Double {
    var result = sumDeposit.toDouble()
    var i = 1
    while (i <= bestBefore) {
        val interestProfit = result * interestRate / TOTAL_PERCENT
        result += interestProfit
        i++
    }
    return result
}