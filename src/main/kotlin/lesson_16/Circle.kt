package org.example.lesson_16

private const val PI = 3.14

class Circle(
    private val radius: Int,
) {
    fun calculateLengthCircle(): Double {
        return 2 * PI * radius
    }

    fun calculateSquare(): Double {
        return PI * (radius * radius)
    }
}

fun main() {
    val circle = Circle(15)
    println("Длина окружности: ${circle.calculateLengthCircle()}")
    println("Площадь круга: ${circle.calculateSquare()}")

}
/*
Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину
окружности и площадь круга, используя радиус.

Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным
от изменений извне. Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.

Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль
 */