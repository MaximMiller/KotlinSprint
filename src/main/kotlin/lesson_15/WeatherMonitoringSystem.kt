package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class Temperature(
    private val valueTemp: Double,
) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура $valueTemp °С"
    }

}

class PrecipitationAmount(
    private val valuePrecipitation: Double,
) : WeatherStationStats() {
    override fun getData(): String {
        return "Количество осадков $valuePrecipitation мм"
    }

}

class WeatherServer {
    fun sendingMessage(data: WeatherStationStats) {
        when (data) {
            is Temperature -> println("Отправить данные температуры ${data.getData()}")
            is PrecipitationAmount -> println("Отправить данные осадков ${data.getData()}")
            else -> println("Неизветсный тип данных")
        }
    }
}

fun main() {
    val temperature = Temperature(32.5)
    val amountPrecipitation = PrecipitationAmount(5.6)
    val serverWeather = WeatherServer()
    serverWeather.sendingMessage(temperature)
    serverWeather.sendingMessage(amountPrecipitation)
}
/*
Необходимо разработать простую систему мониторинга погодных условий,
которая будет собирать данные о температуре и количестве осадков.

Создай абстрактный класс WeatherStationStats. Он будет служить родителем для
классов-объектов погодных данных: Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer.
Метод отправки сообщения должен определять тип переданного сообщения и в зависимости от
результата передавать соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.
 */