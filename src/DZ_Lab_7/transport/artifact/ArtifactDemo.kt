package artifact

fun main() {
    val artifacts = listOf<MagicItem>(
        Weapon(
            name = "Огненный клинок",
            power = 45,
            rarity = "Rare",
            damageType = "огонь",
            isTwoHanded = false
        ),
        Potion(
            name = "Зелье невидимости",
            power = 30,
            rarity = "Epic",
            effectDuration = 60,
            isConsumable = true
        ),
        Relic(
            name = "Око дракона",
            power = 80,
            rarity = "Legendary",
            origin = "древнее эльфийское",
            charges = 3
        )
    )
    for (artifact in artifacts) {
        artifact.describe()
        println("Использование: ${artifact.use()}")
        println()
    }
}