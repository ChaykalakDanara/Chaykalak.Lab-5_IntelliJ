class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var element: String = "Обычный"

    fun sayHello() {
        println("Я – $name, мой путь только начинается!")
    }

    fun showStats() {
        println("Имя: $name  Класс: $role  HP: $hp  MP: $mp  Level: $level  Element: $element")
    }

    fun meditate() {
        println("$name медитирует")
        mp += 20
        println("Мана восстановлена. Текущая мана: $mp")
    }

    fun takeDamage() {
        println("$name получает урон!")
        hp -= 10
        println("Осталось здоровья: $hp")
    }

    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
        if (hp <= 0) {
            die()
        }
    }

    fun die() {
        println("Герой $name умер!")
    }
    fun castSpell() {
        if (mp >= 10) {
            println("$name применяет магию!")
            mp -= 10
            println("Потрачено 10 маны. Осталось маны: $mp")
        } else {
            println("Недостаточно маны - $mp")
        }
    }
    fun heal() {
        if (mp >= 10) {
            println("Восстановлено здоровье, потрачено 10 маны.")
            hp += 10
            mp -= 10
            println("Здоровье: $hp | Мана: $mp")
        } else {
            println("Недостаточно маны- $mp")
        }
    }
    fun greet(name: String) {
        println("Привет, $name!")
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(amount = damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name использует заклинание '$spellName' против ${enemy.name}!")

        if (mp >= 10) {
            if (element == enemy.element) {
                println("Стихии совпадают! Урон снижен.")
                val reducedDamage = damage / 2
                enemy.takeDamage(amount = reducedDamage)
            } else {
                enemy.takeDamage(amount = damage)
            }

            mp -= 10
            if (mp < 0) mp = 0
            println("Осталось маны: $mp")
        } else {
            println("Недостаточно маны для заклинания!")
        }
    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")
        println("$name атакует первым!")
        opponent.takeDamage(amount = 15)
        println("${opponent.name} отвечает!")
        this.takeDamage(amount = 15)
        println("Дуэль завершена. Состояние героев:")
        this.showStats()
        opponent.showStats()
    }
}