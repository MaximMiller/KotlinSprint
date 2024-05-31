package org.example.lesson_16

class Order(
    private val id: Int,
    private var status: String,
) {

    private fun changeStatus(changeStatus: String): String {
        status = changeStatus
        return status
    }

    fun callManager(changeStatus: String) {
        changeStatus(changeStatus)
    }

    override fun toString(): String {
        return "Статус заказа: $status"
    }
}

fun main() {
    val order = Order(1, "В резерве")
    println(order)
    order.callManager("Доставка")
    println(order)

}
/*
Создай класс, описывающий заказ в интернет-магазине. В заказе должны быть номер заказа
и статус готовности. Номер заказа должен быть недоступен для изменения.

Создай метод, который меняет статус заказа. Поменять статус заказа можно только отправив
заявку менеджеру. Имитируй это действие отдельной публичной функцией. Она будет принимать новый
статус и обращаться к внутреннему методу класса для изменения статуса.
 */