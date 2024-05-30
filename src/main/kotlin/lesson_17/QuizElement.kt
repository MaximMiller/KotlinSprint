package org.example.lesson_17


class QuizElement(question: String, answer: String) {

    val question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz = QuizElement("Как твое имя?", "Андрей")
    quiz.question
    quiz.answer = "14"

}


/*
Создай класс, описывающий элемент викторины.
В primary конструкторе два текстовых свойства: вопрос и ответ.

Явно пропиши для вопроса геттер, для ответа геттер и сеттер.
 */