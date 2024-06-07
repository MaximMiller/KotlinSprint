package org.example.lesson_18

open class Shape(val x: Number, val y: Number)

class Point(x: Number, y: Number) : Shape(x, y)

class Square(x: Number, y: Number, val sideLength: Number) : Shape(x, y)

class Circle(x: Number, y: Number, val radius: Number) : Shape(x, y)

class Screen {
    fun draw(point: Point) {
        println("Рисуем точку с координатами (${point.x}, ${point.y})")
    }

    fun draw(square: Square) {
        println("Рисуем квадрат с верхним левым углом (${square.x}, ${square.y}) и стороной ${square.sideLength}")
    }

    fun draw(circle: Circle) {
        println("Рисуем круг с центром (${circle.x}, ${circle.y}) и радиусом ${circle.radius}")
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
}/*
В приложении есть экран. Мы можем рисовать в нем разные объекты,
указывая координаты (x, y) и сам объект. Объектами выступают круг, квадрат и точка.
Координаты могут быть как Int, так и Float.

Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).
 */