package characters

import world.Quest

fun main() {

    val naruto = Hero(
        name = "Наруто",
        gender = "мужской",
        role = "Шиноби",
        level = 5,
        element = "Ветер",
        hp = 150,
        mp = 200
    )
    naruto.showStats()

    val kakashi = Hero(
        name = "Какаши",
        gender = "мужской",
        role = "Шиноби",
        level = 15,
        element = "Молния",
        hp = 250,
        mp = 300
    )
    kakashi.showStats()

    val orochimaru = Enemy(
        name = "Орочинару",
        hp = 350,
        element = "Ветер"
    )

    naruto.castSpellOn(
        enemy = orochimaru,
        spellName = "Расенган",
        damage = 30
    )

    println("Герой жив? ${naruto.isAlive()}")

//    val easyQuest = Quest(
//        title = "Сбор трав",
//        duration = 2,
//        reward = 100,
//        difficulty = "Лёгкий"
//    )
//    val hardQuest = Quest(
//        title = "Охота на дракона",
//        duration = 10,
//        reward = 1000,
//        difficulty = "Сложный")
//
//    naruto.canAcceptQuest(easyQuest)
//    naruto.canAcceptQuest(hardQuest)

    val blacksmith = NPC(name = "Кузнец Ульфрик", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()

    val dragon = Boss(
        name = "Алдуин",
        hp = 500,
        element = "Огонь",
        phaseCount = 4,
        isFinalBoss = true
    )
    dragon.startPhase(phaseNumber = 2)
    println(dragon.dropLoot())
    dragon.takeDamage(amount = 150)



//Задание 4.лаб - 6
//    val goblin = Enemy(name = "Гоблин", hp = 30)
//    val orc = Enemy(name = "Орк", hp = 100)
//    val dragon = Enemy(name = "Дракон", hp = 200)
//
//    goblin.calculatePower()
//    orc.calculatePower()
//    dragon.calculatePower()
}

private fun Hero.castSpellOn(enemy: Enemy, spellName: String, damage: Int) {}
