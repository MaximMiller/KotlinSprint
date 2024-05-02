package org.example.lesson_8

const val SIZE_ARRAY = 7
const val NUMBER_VIEW_FOR_DAY = 50
fun main() {
    /*
    Скрипт считает количество просмотров рекламы за день. Напиши программу, которая сохраняет в
    массив данные просмотров
    за неделю (числа использовать на свое усмотрение). Каждая ячейка хранит количество просмотров за день. Имея массив
    с данными, нужно посчитать сколько всего было просмотров за неделю. Результат вычислений выведи в консоль.
     */
    var totalViewsForWeek = 0
    val viewsForWeek = Array(SIZE_ARRAY) { i -> i * NUMBER_VIEW_FOR_DAY }

    for (i in viewsForWeek) {
        totalViewsForWeek += i
    }
    println(totalViewsForWeek)
}
