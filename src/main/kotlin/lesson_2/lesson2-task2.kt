package org.example.lesson_2

fun main() {
    /*
    В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
    которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии,
    который будет считать:
дабавил расчеты:
– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
     */
    val numberOfPermanentEmployees = 50
    val salaryOfPermanentEmployees = 30000
    val numberOfInterns = 30
    val salaryOfInterns = 20000

    val expsForSalaryPermanentEmployees: Int = numberOfPermanentEmployees * salaryOfPermanentEmployees
    val expsForSalaryInterns: Int = numberOfInterns * salaryOfInterns
    val totalExpsForSalary: Int = expsForSalaryInterns + expsForSalaryPermanentEmployees
    val totalAmountEmployees: Int = numberOfPermanentEmployees + numberOfInterns
    val averageSalaryEmployees: Int = totalExpsForSalary / totalAmountEmployees

    println("Расходы на выплату зарплаты постоянных сотрудников $expsForSalaryPermanentEmployees рублей")
    println("Общие расходы по ЗП на стажеров $expsForSalaryInterns рублей")
    println("Общие расходы по ЗП после прихода стажеров $totalExpsForSalary рублей")
    println("Общее количество сотрудников $totalAmountEmployees человек")
    println("Средняя ЗП одного сотрудника после устройства стажеров $averageSalaryEmployees рублей")
}