package org.example.lesson_14

const val PI = 3.14

abstract class Figure(val color: String) {
    abstract fun calcArea(): Double
    abstract fun calcPerimeter(): Double
}

class Circle(
    color: String,
    private val radius: Int,
) : Figure(color) {
    override fun calcArea(): Double {
        return PI * (radius * radius)
    }

    override fun calcPerimeter(): Double {
        return 2 * PI * radius
    }

}

class Rectangle(
    color: String,
    private val width: Double,
    private val height: Double,
) : Figure(color) {
    override fun calcArea(): Double {
        return width * height
    }

    override fun calcPerimeter(): Double {
        return 2.0 * (width + height)
    }
}

fun main() {
    val listFigure = listOf(
        Circle("black", 5),
        Circle("white", 5),
        Rectangle("black", 6.0, 3.0),
        Rectangle("white", 31.0, 15.0)
    )
    var sumPerimetersBlackFigures = 0.0
    for (it in listFigure) {
        sumPerimetersBlackFigures = listFigure.filter { it.color == "black" }.map { it.calcArea() }.sumOf { it }
    }
    var sumAreasWhiteFigures = 0.0
    for (it in listFigure) {
        sumAreasWhiteFigures = listFigure.filter { it.color == "white" }.map { it.calcPerimeter() }.sumOf { it }
    }
    println("Сумма периметров всех черных фигур: $sumPerimetersBlackFigures")
    println("Сумма площадей всех белых фигур: $sumAreasWhiteFigures")
}
/*
Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником.
Каждая фигура имеет свой цвет и уникальные параметры:

- для КРУГА — радиус;
- для прямоугольника — ширину и высоту.

Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:

- для вычисления площади;
- для вычисления периметра.

Добавь классы-наследники для вышеупомянутых типов фигур. Реализуй методы для вычисления
 площади и периметра в каждом из классов-наследников (формулы можно найти в интернете).

Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:

- сумму периметров всех черных фигур;
- сумму площадей всех белых фигур
 */