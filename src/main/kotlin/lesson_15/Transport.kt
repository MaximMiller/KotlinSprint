package org.example.lesson_15

interface TransportationPassenger {
    fun loadingPassenger()
    fun unloadingPassenger()
}

interface TransportationGoods {
    fun loadingGoods()
    fun unloadingGoods()
}

interface Movement {
    fun move(amountCars: Int)
}

class CargoCar(
    private val title: String,
    private val maxCargo: Int = 2,
    private var currentCargo: Int = 0,
) : Movement, TransportationGoods {
    override fun loadingGoods() {
        for (i in 0..maxCargo) {
            if (currentCargo < maxCargo) {
                currentCargo++
                println("Загрузка по 1 тонне. Текущий вес груза: $currentCargo")
            } else {
                println("Грузовой авто полностью загружен.")
            }
        }
    }

    override fun unloadingGoods() {
        for (i in 0..maxCargo) {
            if (currentCargo > 0) {
                currentCargo--
                println("Разгрузка по 1 тонне. Текущий вес груза: $currentCargo")
            } else {
                println("Грузовой авто полностью разгружен.")
            }
        }
    }

    override fun move(amountCars: Int) {
        println("$title перевозит грузы")
        for (i in 1..amountCars) {
            loadingGoods()
            unloadingGoods()
        }
    }

    fun calculateAmountCargoCars(needToTransportGoods: Int): Int {
        return needToTransportGoods / maxCargo
    }
}

class PassengerCars(
    private val title: String,
    val maxPassengers: Int = 3,
    private var currentPassengers: Int = 0,
) : TransportationPassenger, Movement {
    override fun loadingPassenger() {
        for (i in 0..maxPassengers) {
            if (currentPassengers < maxPassengers) {
                currentPassengers++
                println("${title}: Загрузка пассажиров. Текущее количество пассажиров: $currentPassengers")
            } else {
                println("Пассажирский авто полностью заполнен. Больше нет мест для пассажиров.")
            }
        }
    }

    override fun unloadingPassenger() {
        for (i in 0..maxPassengers) {
            if (currentPassengers > 0) {
                currentPassengers--
                println("${title}: Разгрузка пассажиров. Текущее количество пассажиров: $currentPassengers")
            } else {
                println("Пассажирский авто пуст - пассажиров нет")
            }
        }
    }

    override fun move(amountCars: Int) {
        println("$title перевозит пассажиров")
        for (i in 1..amountCars) {
            loadingPassenger()
            unloadingPassenger()
        }
    }

    fun calculateAmountPassengerCars(needToTransportPassengers: Int): Int {
        return needToTransportPassengers / maxPassengers
    }
}

fun main() {
    val needToTransportPassengers = 6
    val needToTransportGoods = 2
    val cargo = CargoCar("Камаз")
    val passengerCars = PassengerCars("Лада")

    passengerCars.move(passengerCars.calculateAmountPassengerCars(needToTransportPassengers))
    cargo.move(cargo.calculateAmountCargoCars(needToTransportGoods))

}

/*
В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:

- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
- легковые не перевозят груз, но могут вместить до 3 пассажиров.

Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.

- учитывай максимальное и текущее количество перевозимых людей или грузов;
- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.

Спроектируй классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.
 */