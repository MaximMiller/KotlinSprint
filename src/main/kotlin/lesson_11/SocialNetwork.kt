package org.example.lesson_11

class Participant(
    val nickName: String,
    val avatars: String,
    var speakerStatus: String,
)

class Room(
    val cover: String,
    val name: String,
) {
    private val listParticipant = mutableListOf<Participant>()
    fun addParticipant(participant: Participant) {
        listParticipant.add(participant)
    }

    fun updateSpeakerStatus(name: String, newStatus: String) {
        listParticipant.find { it.nickName == name }?.speakerStatus = newStatus
    }

    fun displayingInfoParticipant(name: String) {
        val participant = listParticipant.find { it.nickName == name }
        if (participant != null) {
            println("Participant: ${participant.nickName}, status: ${participant.speakerStatus}")
        }
    }
}

fun main() {
    val room1 = Room(
        cover = "icon.jpg",
        name = "Music",
    )
    val participantMax = Participant(
        nickName = "Max",
        avatars = "iconMax.jpg",
        speakerStatus = "разговаривает"
    )
    val participantPiter = Participant(
        nickName = "Piter",
        avatars = "iconPiter.jpg",
        speakerStatus = "микрофон выключен"
    )
    val participantAnna = Participant(
        nickName = "Anna",
        avatars = "iconAnna.jpg",
        speakerStatus = "пользователь заглушен"
    )
    room1.addParticipant(participantMax)
    room1.addParticipant(participantPiter)
    room1.addParticipant(participantAnna)
    room1.updateSpeakerStatus("Max", "пользователь заглушен")
    room1.displayingInfoParticipant("Max")
}
/*
Прокачиваем абстрактное мышление. Задача на проектирование сущностей для
упрощенной версии приложения социальной сети, в которой общаются только голосом.
Требуется описать сущности и имитировать действия методами.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты”
для общения по интересам. В карточке “комнаты” отображается:

- обложка;
- название;
- список участников — отображаются в виде аватарок. При долгом нажатии на аватар подсветится
его никнейм. Рядом с аватаркой отображается текстовый бейдж с одним из возможных статус
говорящего: “разговаривает”, “микрофон выключен”, “пользователь заглушен”.

Класс должен содержать методы:

– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
– обновления статуса (принимает имя пользователя и новый статус);
– вывода информации о пользователе при долгом нажатии на аватар.

После проектирования создай объект комнаты с произвольными данными.
 */