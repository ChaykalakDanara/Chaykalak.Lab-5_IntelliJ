package DZ_Lab_7.transport

class Dragon(
    name: String = "Дракон",
    speed: Int = 120,
    capacity: Int = 3
) : Transport(name, speed, capacity) {
    override fun move() {
        println("$name летит высоко над землёй")
    }
    override fun specialAbility() {
        println("$name дышит огнём и перевозит героя по воздуху")
    }
}