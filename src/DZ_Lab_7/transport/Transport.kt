package DZ_Lab_7.transport

open class Transport(
    val name: String,
    val speed: Int,
    val capacity: Int
) {
    open fun describe() {
        println("Транспорт: $name, Скорость: $speed, Вместимость: $capacity")
    }
    open fun move() {
        println("$name двигается")
    }
    open fun specialAbility() {
        println("$name имеет особую способность")
    }
}