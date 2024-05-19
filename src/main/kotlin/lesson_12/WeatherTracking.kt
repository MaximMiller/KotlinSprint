package org.example.lesson_12

class WeatherTracking(
    private val dayTimeTemperature: Int,
    private val nightTemperature: Int,
    private val badWeather: Boolean,
) {
    fun printData() {
        println(
            "Дневная температура: $dayTimeTemperature\nНочная температура: $nightTemperature\n" +
                    "Наличие осадков в течение суток: $badWeather"
        )
    }
}

fun main() {
    val monday = WeatherTracking(21, 18, false)
    monday.printData()
}
/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

- перепиши его, используя определение свойств в основном конструкторе;
- свойства не должны содержать значения по умолчанию (мы создаем каркас сущности для будущих объектов).

Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.
 */