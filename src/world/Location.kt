package world

class Location(
    val name: String,
    val dangerLevel: String = "Низкий",
    val requiredLevel: Int = 1
) {
    fun isDangerous(): Boolean {
        return dangerLevel == "Высокий"
    }
}