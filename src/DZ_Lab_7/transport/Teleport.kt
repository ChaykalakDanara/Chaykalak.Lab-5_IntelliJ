package DZ_Lab_7.transport

class Teleport(
    name: String = "Телепорт",
    speed: Int = 1000,
    capacity: Int = 1
) : Transport(name, speed, capacity) {
    override fun move() {
        println("$name мгновенно перемещается в другое место")
    }
    override fun specialAbility() {
        println("$name нужна мана для активации, мгновенное перемещение")
    }
}