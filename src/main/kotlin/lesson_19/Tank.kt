package org.example.lesson_19

enum class TypesOfBullets(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var loadedAmmo: TypesOfBullets? = null

    fun weapons(type: TypesOfBullets) {
        loadedAmmo = type
        println("Танк заряжен патронами ${type.name}")
    }

    fun shoot() {
        println("Выстрел! Нанесенный урон: ${loadedAmmo?.damage}")
    }
}

fun main() {
    val tank = Tank()
    tank.weapons(TypesOfBullets.BLUE)
    tank.shoot()
    tank.weapons(TypesOfBullets.GREEN)
    tank.shoot()
    tank.weapons(TypesOfBullets.RED)
    tank.shoot()
}
/*
В компьютерной игре танк может подбирать разные виды патронов.
Патроны различаются силой удара. Синие – 5 единиц, зеленые – 10, красные – 20.

 – создай enum класс для патронов и класс танка. У танка должны быть
  методы вооружения новым типом патронов и выстрела. При выстреле в консоль должен выводиться нанесенный урон;
 – создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
– экземпляр танка при создании ничем не заряжен;
 – в решении должен использоваться enum.
 */