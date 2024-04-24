package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    /*
        На территории агрокомплекса функционирует система автоматического мониторинга условий для
        роста растений. Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.

    Критерии благоприятных условий включают:

    - наличие солнечной погоды;
    - открытый тент;
    - влажность воздуха составляет 20%;
    - текущее время года - не зима.

    Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых? true/false”

    Для проверки работы программы, инициализируй переменные следующими значениями:

    - погода сегодня - солнечная;
    - тент на данный момент - открыт;
    - влажность воздуха - 20%;
    - текущее время года - зима.

    И типами данных - boolean, boolean, int, String.
     */
    val weatherTodayIsSunny = true
    val awningIsOpen = true
    val airHumidity = 20
    val currentSeason = "зима"
    val favorableConditions = IS_SUNNY == weatherTodayIsSunny && IS_AWNING_OPEN == awningIsOpen &&
                              AIR_HUMIDITY == airHumidity && currentSeason != SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}