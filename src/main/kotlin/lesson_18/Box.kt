package org.example.lesson_18

abstract class Box {
    abstract fun calculateAreaPackaging(): Double
}

class RectangularBox(
    private val length: Double,
    private val wight: Double,
    private val height: Double,
) : Box() {
    override fun calculateAreaPackaging(): Double {
        return length + wight + height
    }
}

class CubeBox(
    private val ribLength: Double,
) : Box() {
    override fun calculateAreaPackaging(): Double {
        return 6 * (ribLength * ribLength)
    }
}

fun main() {
    val rectangularBox = RectangularBox(5.0, 6.0, 7.0)
    val cubeBox = CubeBox(32.0)

    val listBox = listOf<Box>(rectangularBox, cubeBox)
    listBox.forEach { println("Площадь поверхности посылки ${it.calculateAreaPackaging()}") }
}
/*
В программе хранятся данные о посылках. Нужно написать иерархию классов,
описывающих коробки. Чтобы рассчитывать упаковку для посылок, в классе должен быть метод,
 возвращающий площадь поверхности посылки.

Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой. Если
посылка – куб, то только с длиной ребра.
 */