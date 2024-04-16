package org.example.lesson_2

const val TOTAL_MINUTES_AN_HOUR = 60

fun main() {
    /*
    Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
    а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
     */
    val hourDeparture = 9
    val minutesDeparture = 39
    val totalTravelTimeInMinutes = 457

    val convertingHourInMin = hourDeparture * TOTAL_MINUTES_AN_HOUR
    val convertingMinInMin = convertingHourInMin + minutesDeparture
    val calculationTotalTravelTimeInMinutes = convertingMinInMin + totalTravelTimeInMinutes
    val comingMin = calculationTotalTravelTimeInMinutes % TOTAL_MINUTES_AN_HOUR
    val comingHour = calculationTotalTravelTimeInMinutes / TOTAL_MINUTES_AN_HOUR

    println("Поезд прибудет на станцию в ${String.format("%02d:%02d", comingHour, comingMin)} по МСК")
}