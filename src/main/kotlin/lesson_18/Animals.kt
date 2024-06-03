package org.example.lesson_18

abstract class Animals(
    private val name: String,
) {
    abstract fun eat(): String
    abstract fun sleep(): String
    fun printData() {
        println("$name-> ${eat()}")
        println("$name-> ${sleep()}")
    }
}

class Fox(name: String) : Animals(name) {
    override fun eat(): String {
        return "Лиса ест ягоды"
    }

    override fun sleep(): String {
        return "Лиса спит"
    }
}

class Dog(name: String) : Animals(name) {
    override fun eat(): String {
        return "Собака ест кости"
    }

    override fun sleep(): String {
        return "Собака спит"
    }
}

class Cat(name: String) : Animals(name) {
    override fun eat(): String {
        return "Кошка ест рыбу"
    }

    override fun sleep(): String {
        return "Кошка спит"
    }
}

fun main() {
    val fox = Fox("Рыжая")
    val dog = Dog("Мурка")
    val cat = Cat("Рекс")
    val listAnimals = listOf<Animals>(fox, dog, cat)
    listAnimals.forEach { it.printData() }

}
/*
В тамагочи есть лиса, собака и кошка. Они могут только есть и спать.

Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
Эти действия отображаются в консоли по такому шаблону: “[имя] -> [действие]”.

– опиши эти классы, используя полиморфизм;
– создай по одному объекту животного, сохрани их в список с принудительным указанием типа списка;
– в цикле вызывай метод приема пищи для каждого экземпляра.
 */