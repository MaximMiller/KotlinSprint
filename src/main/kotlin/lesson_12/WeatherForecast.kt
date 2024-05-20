package org.example.lesson_12

class WeatherForecast(
    dayTimeTemperature: Int,
    nightTemperature: Int,
    badWeather: Boolean,
) {
    init {
        println(
            "Дневная температура: $dayTimeTemperature\nНочная температура: $nightTemperature\n" +
                    "Наличие осадков в течение суток: $badWeather"
        )
    }
}

fun main() {
    val weather = WeatherForecast(25, 15, true)
}
/*
Измени программу таким образом, чтобы информация о погоде
выводилась в консоль сразу при создании объекта.
 */