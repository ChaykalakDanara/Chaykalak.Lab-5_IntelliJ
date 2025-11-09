package DZ_Lab_7.transport

class Boat(
    name: String = "Лодка",
    speed: Int = 30,
    capacity: Int = 6
) : Transport(name, speed, capacity) {
    override fun move() {
        println("$name плывёт по воде")
    }
    override fun specialAbility() {
        println("$name может перевозить группу по рекам и озёрам")
    }
}