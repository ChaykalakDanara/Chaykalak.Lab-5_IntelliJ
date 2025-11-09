package magic

import characters.Hero

fun main() {
    val fireWall = Spell(
        name = "Огненная Стена",
        width = 5,
        height = 3,
        symbol = "\uD83D\uDD25"
    )
    fireWall.cast()
    val iceSheet = Spell(
        name = "Ледяной щит",
        size = 4,
        symbol = "\u2744\uFE0F"
    )
    iceSheet.cast()
    val spell = Spell()
    spell.cast()
    val heal = InstantSpell(
        name = "Лечение",
        symbol = "\uD83D\uDC9A",
        power = 5
    )
    println("Площадь огненной стены: ${fireWall.area()}")
    println("Площадь ледяного щита: ${iceSheet.area()}")
    println("Площадь пустого заклинания: ${spell.area()}")
    println(fireWall.description())
    println(iceSheet.description())
    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")

    //Задание 3 -Лаба-6
    val hero = Hero("Снейп", "мужской", "Маг", 3, "Огонь", 100, 200)

    val smallSpell = Spell("Огнь", 3, 3, "\u2744\uFE0F")
    val largeSpell = Spell("Огненная буря", 6, 6, "\u2744\uFE0F")
    val longNameSpell = Spell("СуперМегаУльтраАльфаЛедяннаяЛихорадка", 4, 4, "\uD83D\uDD25")

    hero.canCast(smallSpell)
    hero.canCast(largeSpell)
    hero.canCast(longNameSpell)
}