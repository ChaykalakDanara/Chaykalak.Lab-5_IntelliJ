package DZ_Lab_7.transport

class Horse(
    name: String = "Скакун",
    speed: Int = 60,
    capacity: Int = 2
) : Transport(name, speed, capacity) {
    override fun move() {
        println("$name скачет по равнинам")
    }
    override fun specialAbility() {
        println("$name может ускориться в бою")
    }
}