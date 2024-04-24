package org.example.lesson_4

const val IS_GOOD_CONDITION_SHIP = true
const val MIN_QUANTITY_TEAM = 55
const val MAX_QUANTITY_TEAM = 70
const val MIN_QUANTITY_BOXES_FOOD = 50

fun main() {
    /*
Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек (включительно);
- на борту есть более 50 ящиков провизии;
- погода благоприятная или неблагоприятная.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:
допустимое сосотояние
- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть 50 и более ящиков провизии.
В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание. Программа должна анализировать эти данные и выводить результат в консоль.
Для анализа должно использоваться единое составное условие, состоящее только из логических операторов.
     */
    println("Ваш корабль имеет повреждения?(true/false)")
    val conditionShip = readln().toBoolean()
    println("Укажите текущее количество экипажа")
    val quantityTeam = readln().toInt()
    println("Укажите количество ящиков с провизией на борту")
    val quantityBoxesFood = readln().toInt()
    println("Метеоусловия благопритяные?(true/false)")
    val isWeatherGood = readln().toBoolean()

    val recommendedState =
        conditionShip != IS_GOOD_CONDITION_SHIP && quantityTeam >= MIN_QUANTITY_TEAM && quantityTeam <= MAX_QUANTITY_TEAM &&
            quantityBoxesFood > MIN_QUANTITY_BOXES_FOOD && isWeatherGood || !isWeatherGood

    val validState =
        conditionShip && quantityTeam == MAX_QUANTITY_TEAM && isWeatherGood && quantityBoxesFood >= MIN_QUANTITY_BOXES_FOOD

    when {
        recommendedState -> println("Состояние готовности к плаванию Вашего Научно-исследовательский корабля = Рекомендованное")
        validState -> println("Состояние готовности к плаванию Вашего Научно-исследовательский корабля = Допустимое")
        else -> println("Состояние готовности к плаванию Вашего Научно-исследовательский корабля = Запрет на плавание")
    }
}
