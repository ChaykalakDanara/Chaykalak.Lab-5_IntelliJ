package artifact

class Relic(
    name: String,
    power: Int,
    rarity: String,
    val origin: String,
    var charges: Int
) : MagicItem(name, power, rarity) {
    override fun describe() {
        super.describe()
        println("Происхождение: $origin, Заряды: $charges")
    }
    override fun use(): String {
        if (charges > 0) {
            charges--
            return "$name использовано! Осталось зарядов: $charges"
        } else {
            return "$name разряжено! Нельзя использовать"
        }
    }
}