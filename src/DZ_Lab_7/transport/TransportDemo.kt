package DZ_Lab_7.transport

fun main() {
    val transports = listOf<Transport>(
        Horse(),
        Dragon(),
        Boat(),
        Teleport()
    )
    for (transport in transports) {
        transport.describe()
        transport.move()
        transport.specialAbility()
        println()
    }
}