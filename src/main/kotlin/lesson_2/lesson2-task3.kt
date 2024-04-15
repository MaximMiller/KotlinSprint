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

    println(timeTrainArrival(hourDeparture, minutesDeparture, totalTravelTimeInMinutes))
}

fun timeTrainArrival(hourDeparture: Int, minutesDeparture: Int, totalTravelTimeInMinutes: Int): String {
    val convertingHourInMin = hourDeparture * TOTAL_MINUTES_AN_HOUR
    val convertingMinInMin = convertingHourInMin + minutesDeparture
    val calculationTotalTravelTimeInMinutes = convertingMinInMin + totalTravelTimeInMinutes
    val comingMin = calculationTotalTravelTimeInMinutes % TOTAL_MINUTES_AN_HOUR
    var comingHour = calculationTotalTravelTimeInMinutes / TOTAL_MINUTES_AN_HOUR
    if (comingHour >= 24) {
        comingHour -= 24
    }
    val result = "Поезд прибудет на станцию в $comingHour:$comingMin по МСК"
    return result
}