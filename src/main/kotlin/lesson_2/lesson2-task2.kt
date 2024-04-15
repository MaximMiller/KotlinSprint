package org.example.lesson_2

fun main() {
    /*
    В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
    которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии,
    который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
     */
    val numberOfPermanentEmployees = 50
    val salaryOfPermanentEmployees = 30000
    val numberOfTrainee = 30
    val salaryOfTrainee = 20000

    val expsForPayingPermanentEmployees: Int = numberOfPermanentEmployees * salaryOfPermanentEmployees
    println("Расходы на выплату зарплаты постоянных сотрудников $expsForPayingPermanentEmployees рублей")
    val expsForPayingTrainee: Int = numberOfTrainee * salaryOfTrainee
    println("Общие расходы по ЗП на стажеров $expsForPayingTrainee рублей")
    val generalExpsForPaying: Int = expsForPayingTrainee + expsForPayingPermanentEmployees
    println("Общие расходы по ЗП после прихода стажеров $generalExpsForPaying рублей")
    val generalAmountPersonal: Int = numberOfPermanentEmployees + numberOfTrainee
    println("Общие количество сотрудников $generalAmountPersonal человек")
    val avaragySalaryEmployees: Int = generalExpsForPaying / generalAmountPersonal
    println("Среднюю ЗП одного сотрудника после устройства стажеров $avaragySalaryEmployees рублей")
}