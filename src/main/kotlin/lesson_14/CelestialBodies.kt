package org.example.lesson_14

open class CelestialBodies(
    val name: String,
    val hasAtmosphere: Boolean,
    val canLandingPlace: Boolean,
)

class Planets(
    name: String,
    hasAtmosphere: Boolean,
    canLandingPlace: Boolean,
    val listSatellite: MutableList<Satellite>,
) : CelestialBodies(name, hasAtmosphere, canLandingPlace) {

}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    canLandingPlace: Boolean,
) : CelestialBodies(name, hasAtmosphere, canLandingPlace)

fun main() {
    val listSatelliteEarth = mutableListOf(
        Satellite("Луна", false, canLandingPlace = false),
        Satellite("Круитни", hasAtmosphere = true, canLandingPlace = false)
    )
    val planets = Planets("Земля", true, canLandingPlace = true, listSatellite = listSatelliteEarth)
    println("Название планеты: ${planets.name}\nНазвание спутников: ${planets.listSatellite.map { it.name }}")

}
/*
В компьютерной игре существуют планеты. У некоторых из них есть спутники.

Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.

Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.

- планета должна хранить список спутников.

Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.
 */