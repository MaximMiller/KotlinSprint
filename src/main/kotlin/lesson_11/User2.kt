package org.example.lesson_11

class User2(
    private val id: Int,
    private val login: String,
    private var password: String,
    private val mail: String,
    private var bio: String = "",

) {

    fun display() {
        println(" id = $id,\n login = $login,\n password = $password,\n mail = $mail,\n bio = $bio")
    }

    fun readText() {
        println("Заполни информацию “о себе”:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен")
        } else {
            println("Ошибка изменения пароля!")
        }
    }
}

fun main() {
    val admin = User2(
        id = 1,
        login = "admin",
        password = "qwerty123%",
        mail = "admin@mail.ru",
    )
    val guest = User2(
        id = 2,
        login = "guest",
        password = "guest123%",
        mail = "guest@mail.ru",
    )

    admin.readText()
    admin.changePassword()
    admin.display()

    guest.readText()
    guest.changePassword()
    guest.display()
}
/*
Скопируй класс User из первой задачи и назови User2. Добавь к классу
новое необязательное свойство bio и несколько методов:

- вывод информации о пользователе в консоль;
- считывание из консоли текста и запись в поле bio;
- изменение пароля — сначала запросить текущий пароль, и, если он введен верно,
запросить новый. Записать его в поле и сообщить, что пароль изменен;

Далее создай объект, заполни информацию “о себе” и замени пароль. В конце выведи
обновленную информацию о пользователе.
 */