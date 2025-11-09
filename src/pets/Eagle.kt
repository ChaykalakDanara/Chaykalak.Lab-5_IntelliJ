package pets

class Eagle(name: String) : Pet(name = name, speed = 250, maxHealth = 50) {
    val flightHeight: Int = 1000

    override fun makeSound() {
        println("$name кричит.")
    }
    override fun describe() {
        super.describe()
        println("$name своим острым взглядом видит всё далеко")
    }
}