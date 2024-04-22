package org.example.lesson_4

fun main() {
    /*
        При работе на таможенном терминале важно точно определить категорию каждого груза.
        Напиши программу, которая проверяет, соответствует ли груз категории "Average".
        Эта категория имеет следующие параметры: вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.

    Создай программу, которая отображает соответствие данных груза категории "Average".
    Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".

    - укажи предварительно заданные параметры категории;
    - проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
    - сделай сравнение непосредственно внутри println() и без использования диапазонов.
     */
    val weightMin = 35
    val weightMax = 100
    val volumeMin = 1
    val volumeMax = 100

    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и $volume л соответствует категории 'Average': ${weight >= weightMin && weight <= weightMax && volume <= volumeMax && volume >= volumeMin}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и $volume л соответствует категории 'Average': ${weight >= weightMin && weight <= weightMax && volume <= volumeMax && volume >= volumeMin}")
}