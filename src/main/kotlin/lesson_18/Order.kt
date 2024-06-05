package org.example.lesson_18

class Order(
    private val orderId: Int,
) {
    fun printMessage(goods: String?) {
        println("Заказан следующий товар: $goods")
    }

    fun printMessage(listGoods: List<String>) {
        println("Заказаны следующие товары: ${listGoods.joinToString(", ")}")
    }

}

fun main() {
    val goodsOne = Order(1)
    val goodsTwo = Order(2)
    val listGoods = listOf("Мышь", "Коврик для мыши", "Монитор")
    goodsOne.printMessage(listGoods)
    goodsTwo.printMessage(listGoods)
    goodsOne.printMessage("Коврик для мыши")
    goodsTwo.printMessage("Коврик для мыши")
}
/*
CRM (система управления взаимоотношениями с клиентами) обрабатывает
заказы в интернет-магазине. Заказ содержит информацию: номер заказа и товары.
Если товар один, он хранится в виде строки, если несколько – в виде списка строк.

По запросу нужно печатать в консоль сообщение «Заказан товар: [название_товара]»
или «Заказаны следующие товары: [название_товара], … [название_товара]».

Создай 2 объекта заказа и вызови у них метод вывода информации и заказе.
Реши задачу, используя полиморфизм с типом ad hoc.
 */