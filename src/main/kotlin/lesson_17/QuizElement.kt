package org.example.lesson_17


class QuizElement(question: String, answer: String) {

    val question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Вопрос: $question\nОтвет: $answer"
    }
}

fun main() {
    val quiz = QuizElement("Как твое имя?", "Андрей")
    quiz.question
    quiz.answer
    println(quiz)
    quiz.answer = "Сергей"
    println(quiz)
}
/*
Создай класс, описывающий элемент викторины.
В primary конструкторе два текстовых свойства: вопрос и ответ.

Явно пропиши для вопроса геттер, для ответа геттер и сеттер.
 */