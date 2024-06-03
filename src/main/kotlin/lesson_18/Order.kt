package org.example.lesson_18

class Order(
    private var _orderId: Int,
) {
    var goods = listOf<String>()
    var oneGoods: String? = null
    fun printMessage(orderId: Int, oneGoods: String?) {
        if (orderId == _orderId) {
            println("Заказан следующий товар: $oneGoods")
        }

    }

    fun printMessage(orderId: Int, goods: List<String>) {
        if (orderId == _orderId) {
            println("Заказаны следующие товары:")
            goods.forEach { println(it) }
        }
    }

}

fun main() {
    val goodsOne = Order(1)
    goodsOne.oneGoods = null
    val goodsTwo = Order(2)
    goodsTwo.goods = listOf("Мышь", "Коврик для мыши", "Монитор")
    goodsOne.printMessage(1, goodsOne.oneGoods)
    goodsTwo.printMessage(2, goodsTwo.goods)
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