package characters

open class Enemy(
    val name: String,
    val hp: Int,
    val element: String = "Огонь",
    val aggressionLevel: Int = 2
) {
    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")
        val currentHp = hp - amount
        if (currentHp <= 0) {
            println("Враг побежден!")
        } else {
            println("Осталось HP врага: $currentHp")
        }
    }

    fun isStrong(): Boolean {
        return hp > 100
    }

    fun getThreatLevel(): String {
        if (hp < 0) {
            return "Некорректное здоровье"
        }
        return when {
            hp <= 50 -> "Низкий"
            hp <= 150 -> "Средний"
            else -> "Высокий"
        }
    }

    fun die() {
        if (hp <= 0) {
            println("$name умер!")
        }
    }

    fun calculatePower(): Int {
        return hp * aggressionLevel
    }
}