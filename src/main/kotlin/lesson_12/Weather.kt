package org.example.lesson_12

class Weather {
    var dayTimeTemperature = 0
    var nightTemperature = 0
    var badWeather = false

    fun printData() {
        println(
            "Дневная температура: $dayTimeTemperature\nНочная температура: $nightTemperature\n" +
                    "Наличие осадков в течение суток: $badWeather"
        )
    }
}

fun main() {
    val todayWeather = Weather()
    todayWeather.badWeather = true
    todayWeather.dayTimeTemperature = 21
    todayWeather.nightTemperature = 15
    todayWeather.printData()

    val tomorrowWeather = Weather()
    tomorrowWeather.dayTimeTemperature = 25
    tomorrowWeather.nightTemperature = 20
    tomorrowWeather.printData()
}
/*
Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре и осадках для одного дня.

Объекты класса будут хранить:

- дневная температура;
- ночная температура;
- наличие осадков в течение суток .

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.

- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.

В этой задаче используй пустой конструктор.
 */