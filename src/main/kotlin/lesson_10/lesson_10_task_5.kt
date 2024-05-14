package org.example.lesson_10

const val LOGIN = "testLogin789&"
const val PASSWORD = "passwordTest32$"
val SHOPPING_CART = listOf("Клавиатура", "Коврик", "WiFi адаптер")

fun main() {
    /*
    Реализуй механизм авторизации в интернет-магазине и получения сохраненного
    ранее списка товаров.

    Метод авторизации принимает логин и пароль, верифицирует пользователя, генерирует и возвращает
    токен доступа. При неудачной авторизации возвращается null. Токен - текстовая строка, генерируемая
    методом авторизации (32 символа, которые включают цифры и буквы англ. алфавита). Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token

    Метод получения корзины принимает токен и возвращает список товаров (содержимое переменной корзины).

    Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации.
    Переменные логин, пароль и корзина  проинициализированы заранее и неизменяемы.
     */
    val jsonWebToken = logIn(LOGIN, PASSWORD)
    val shoppingCart = jsonWebToken?.let { getShoppingCart(it) }

    if (shoppingCart != null) {
        println("Ваша корзина: $shoppingCart")
    } else
        println("Ошибка авторизации!")
}

fun getShoppingCart(jsonWebToken: String): List<String> {
    return  SHOPPING_CART
}

fun generateToken(): String {
    val intRange = '0'..'9'
    val charRange = 'a'..'z'
    val capitalsChar = 'A'..'Z'
    val allChars = intRange + charRange + capitalsChar
    val token = mutableListOf(intRange.random(), charRange.random(), capitalsChar.random())
    for (i in 5..32) {
        token.add(allChars.random())
        token.shuffle()
    }
    return token.joinToString(separator = "")
}

fun logIn(login: String, password: String): String? {
    if (login == LOGIN || password == PASSWORD) {
        return generateToken()
    } else
        return null
}
