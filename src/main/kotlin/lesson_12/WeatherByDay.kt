package org.example.lesson_12

class WeatherByDay(
    var dayTimeTemperature: Int = 0,
    var nightTemperature: Int = 0,
    var isBadWeather: Boolean = false,
) {
    fun printData() {
        println(
            "Дневная температура: $dayTimeTemperature\nНочная температура: $nightTemperature\n" +
                    "Наличие осадков в течение суток: $isBadWeather"
        )
    }
}

fun main() {
    val weatherTheMonth = mutableListOf<WeatherByDay>()
    val listDayTimeTemperature = mutableListOf<Int>()
    val listNightTemperature = mutableListOf<Int>()
    val listBadWeather = mutableListOf<Boolean>()
    var i = 0
    while (i < 30) {
        val weather = WeatherByDay(
            dayTimeTemperature = (10..35).random(),
            nightTemperature = (1..22).random(),
            isBadWeather = Math.random() < 0.5
        )
        weatherTheMonth.add(weather)
        listNightTemperature.add(weather.nightTemperature)
        listDayTimeTemperature.add(weather.dayTimeTemperature)
        if (weather.isBadWeather) {
            listBadWeather.add(weather.isBadWeather)
        }
        i++
    }

    println("Средние значения дневных температур: ${listDayTimeTemperature.average()}")
    println("Средние значения ночных температур: ${listNightTemperature.average()}")
    println("Количество дней с осадками: ${listBadWeather.size}")


}

/*
Продолжи усовершенствовать программу, теперь она должна рассчитывать средние
значения температур и считать количество дней с осадками за месяц.

Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.

- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса,
передав в конструкторы случайные значения;
- сохрани в отдельные списки дневные и ночные температуры, а также список дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции
из стандартной библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль
 */