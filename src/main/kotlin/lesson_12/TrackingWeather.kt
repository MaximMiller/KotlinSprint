package org.example.lesson_12

class TrackingWeather(
    _dayTimeTemperature: Int,
    _nightTemperature: Int,
    _badWeather: Boolean,
) {
    var dayTimeTemperature: Int = _dayTimeTemperature
    var nightTemperature: Int = _nightTemperature
    val badWeather: Boolean = _badWeather

    init {
        dayTimeTemperature -= 273
        nightTemperature -= 273
    }

    fun printData() {
        println(
            "Дневная температура: $dayTimeTemperature градусов по Цельсию\nНочная температура: $nightTemperature " +
                    "градусов по Цельсию\n" + "Наличие осадков в течение суток: $badWeather"
        )
    }
}

fun main() {
    val weather = TrackingWeather(300, 295, true)
    weather.printData()
}

/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.

В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.
 */