package characters

import magic.Spell
import world.Quest

class Hero(
    val name: String,
    val gender: String,
    val role: String,
    val level: Int,
    val element: String,
    val hp: Int,
    val mp: Int
) {
    fun showStats() {
        println("Имя: $name, Пол: $gender, Класс: $role, Уровень: $level, Стихия: $element, Здоровье: $hp, Мана: $mp")
    }

    fun sayHello() {
        println("Я $name, мой путь только начинается!")
    }

    fun meditate() {
        println("$name медитирует...")
        println("Мана восстановлена! Текущая мана: $mp")
    }

    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")
        val currentHp = hp - amount
        if (currentHp <= 0) {
            println("Герой умер")
        } else {
            println("Осталось здоровья: $currentHp")
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

//    fun attack(enemy: characters.Enemy, damage: Int) {
//        println("$name атакует врага ${enemy.name}!")
//        enemy.takeDamage(amount = damage)
//    }
//
//    fun castSpellOn(enemy: characters.Enemy, spellName: String, damage: Int) {
//        println("$name использует заклинание '$spellName' против ${enemy.name}!")
//
//        if (element == enemy.element) {
//            println("Стихии совпадают! Урон снижен.")
//            val reducedDamage = damage / 2
//            enemy.takeDamage(amount = reducedDamage)
//        } else {
//            enemy.takeDamage(amount = damage)
//        }
//
//        println("Осталось маны: $mp")
//    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")
        println("$name атакует первым!")
        opponent.takeDamage(amount = 15)
        println("${opponent.name} отвечает!")
        this.takeDamage(amount = 15)
        println("Дуэль завершена.")
        println("Состояние героев:")
        this.showStats()
        opponent.showStats()
    }

    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "лёгкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }

        if (canAccept) {
            println("$name может принять квест ${quest.title}!")
        } else {
            println("$name не может принять квест ${quest.title}. Требуется более высокий уровень.")
        }

        return canAccept
    }
    fun canCast(spell: Spell): Boolean {
        val nameLengthCondition = spell.name.length <= level * 2
        val sizeCondition = spell.width <= 5 && spell.height <= 5
        return nameLengthCondition && sizeCondition
    }
}