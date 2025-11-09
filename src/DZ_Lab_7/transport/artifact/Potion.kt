package artifact

class Potion(
    name: String,
    power: Int,
    rarity: String,
    val effectDuration: Int,
    val isConsumable: Boolean
) : MagicItem(name, power, rarity) {
    override fun describe() {
        super.describe()
        println("Длительность эффекта: ${effectDuration}сек, Одноразовое: ${if (isConsumable) "Да" else "Нет"}")
    }
    override fun use(): String {
        return if (isConsumable) {
            "$name выпито! Эффект длится $effectDuration секунд"
        } else {
            "$name активировано! Эффект длится $effectDuration секунд"
        }
    }
}