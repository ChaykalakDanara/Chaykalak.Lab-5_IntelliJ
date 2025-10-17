fun main() {
    val naruto = Hero()
    naruto.name = "Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 150

    val sasuke = Hero()
    sasuke.name = "Саске Учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиной-отступник"
    sasuke.hp = 120
    sasuke.mp = 180

    val gojo = Hero()
    gojo.name = "Годжо Сатору"
    gojo.gender = "Мужской"
    gojo.role = "Маг Проклятий"
    gojo.hp = 160
    gojo.mp = 300

    println("Имя: ${naruto.name}  Пол: ${naruto.gender}  Класс: ${naruto.role}  Здоровье: ${naruto.hp}  Мана: ${naruto.mp}")
    println("Имя: ${sasuke.name} Пол: ${sasuke.gender}  Класс: ${sasuke.role}  Здоровье: ${sasuke.hp}  Мана: ${sasuke.mp}")
    println("Имя: ${gojo.name}  Пол: ${gojo.gender}  Класс: ${gojo.role}  Здоровье: ${gojo.hp}  Мана: ${gojo.mp}")

    val hero = Hero()
    print("Введите имя героя: "); hero.name = readln()
    print("Введите пол героя: "); hero.gender = readln()
    print("Введите класс героя: "); hero.role = readln()
    print("Введите здоровье героя: "); hero.hp = readln().toInt()
    print("Введите ману героя: "); hero.mp = readln().toInt()
    print("Введите уровень героя: "); hero.level = readln().toInt()
    print("Введите стихию героя: "); hero.element = readln()

    println("Создан герой: Имя: ${hero.name}  Пол: ${hero.gender}  Класс: ${hero.role}  Здоровье: ${hero.hp}  Мана: ${hero.mp}  Уровень: ${hero.level}  Стихия: ${hero.element}")

    hero.sayHello()
    hero.showStats()
    hero.meditate()
    hero.takeDamage()

    println("Использование магии 10 раз:")
    for (i in 1..10) {
        print("Попытка $i: "); hero.castSpell()
    }
    hero.heal()

    val kakashi = Hero()
    kakashi.name = "Какаши"
    kakashi.role = "Шиноби"
    kakashi.element = "Молния"
    kakashi.mp = 100

    val orochimaru = Enemy()
    orochimaru.name = "Орочимару"
    orochimaru.element = "Ветер"

    naruto.greet("Саске")
    naruto.greet(naruto.name)
    naruto.showStats()
    println("Наруто увидел врага ${orochimaru.name}! Его здоровье - ${orochimaru.hp}")
    naruto.attack(enemy = orochimaru, damage = 25)
    naruto.castSpellOn(enemy = orochimaru, spellName = "Расенган", damage = 30)
    naruto.duel(opponent = kakashi)

    val quest = Quest()
    quest.title = "Охота на гоблинов"
    quest.duration = 2
    quest.reward = 150
    quest.difficulty = "Лёгкий"
    quest.printInfo()

    val quest2 = Quest()
    quest2.init(title = "Охота на тролля", duration = 3, reward = 500, difficulty = "Средний")
    quest2.printInfo()

    val quest3 = Quest()
    quest3.init(title = "Спасение принцессы", reward = 1000, duration = 5, difficulty = "Тяжёлый")
    quest3.printInfo()

    val quests = mutableListOf<Quest>()

    for (i in 1..3) {
        println("Добавим квест #$i")
        val q = Quest()
        print("Название: "); val title = readln()
        print("Время (ч): "); val duration = readln().toInt()
        print("Награда: "); val reward = readln().toInt()
        print("Сложность: "); val difficulty = readln()

        q.init(title, duration, reward, difficulty)
        quests.add(q)
        println()
    }

    println("Все доступные квесты:")
    for (q in quests) {
        q.printInfo()
    }
}
