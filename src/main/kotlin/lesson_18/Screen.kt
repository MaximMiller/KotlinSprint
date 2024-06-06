package org.example.lesson_18

open class Shape

class Point(val x: Number, val y: Number) : Shape()

class Square(val x: Number, val y: Number, val sideLength: Number) : Shape()

class Circle(val x: Number, val y: Number, val radius: Number) : Shape()

class Screen {
    fun draw(shape: Shape) {
        when (shape) {
            is Point -> println("Рисуем точку с координатами (${shape.x}, ${shape.y})")
            is Square -> println(
                "Рисуем квадрат с верхним левым углом (${shape.x}, ${shape.y}) и стороной " +
                        "${shape.sideLength}"
            )

            is Circle -> println("Рисуем круг с центром (${shape.x}, ${shape.y}) и радиусом ${shape.radius}")
            else -> println("Неизвестная фигура")
        }
    }
}

fun main() {
    val screen = Screen()

    val point = Point(1, 2)
    screen.draw(point)

    val square = Square(3, 3, 10)
    screen.draw(square)

    val circle = Circle(5.5f, 5.5f, 2.5f)
    screen.draw(circle)
}
/*
В приложении есть экран. Мы можем рисовать в нем разные объекты,
указывая координаты (x, y) и сам объект. Объектами выступают круг, квадрат и точка.
Координаты могут быть как Int, так и Float.

Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).
 */