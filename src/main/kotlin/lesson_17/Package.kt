package org.example.lesson_17

class Package(
    private val parcelNumber: Int,
    currentLocation: String,
) {
    private var countMovements = 0
    private var changeLocation = currentLocation
        set(value) {
            countMovements++
            field = value
        }

    override fun toString(): String {
        return "Номер заказа: $parcelNumber\nПункт обработки: $changeLocation\nСчетчик перемещений: $countMovements"
    }

    fun changeProcessingPoint(newLocation: String) {
        changeLocation = newLocation
    }

}

fun main() {
    val packageOne = Package(1, "Москва")
    packageOne.changeProcessingPoint("Rostov")
    println(packageOne)
    packageOne.changeProcessingPoint("Самара")
    packageOne.changeProcessingPoint("Калининград")
    println(packageOne)

}

/*
Каждый раз, когда посылка прибывает в промежуточный пункт обработки,
в программе меняется её местоположение. Опиши класс посылки с такими вводными:

- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.

Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика.
 При реализации использовать сеттер.
 */