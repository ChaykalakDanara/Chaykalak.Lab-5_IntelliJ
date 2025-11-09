package world

fun main() {
    val quest = Quest(title = "Поиск артефакта", duration = 3, reward = 800"Средний")
    val contract = Contract(title = "Защита каравана", clientName = "Гильдия купцов",
        taskDescription = "Охрана груза", reward = 1200)
    val specialOp = SpecialOperation(title = "Операция 'Тень'", reward = 2500,
        requiredClearance = 2, isCovert = true)
    val escortQuest = Quest(
        title = "Сопроводи торговца до деревни",
        duration = 4,
        reward = 120,
        difficulty = "Средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()

    println("Информация о квесте:")
    println("Название: ${quest.title}, Награда: ${quest.reward}")

    println("\nИнформация о контракте:")
    println("Название: ${contract.title}, Заказчик: ${contract.clientName}")

    println("\nИнформация о спецоперации:")
    println("Название: ${specialOp.title}")
    specialOp.showReward()

    //Задание2-лаба-6
    val forest = Location("Тёмный лес", "Низкий", 3)
    val dungeon = Location("Логово дракона", "Высокий", 10)
    val village = Location("Деревня тайн")

    println("Лес опасен: ${forest.isDangerous()}")
    println("Подземелье опасно: ${dungeon.isDangerous()}")
    println("Деревня опасна: ${village.isDangerous()}")


    val missions = listOf<Mission>(
        Quest(title = "Охота на монстров", duration = 3, reward = 600, difficulty = "Средний"),
        SpecialOperation(title = "Ночной рейд", reward = 1500, requiredClearance = 2, isCovert = true),
        Contract(title = "Сопровождение каравана", clientName = "Гильдия Торговцев",
            taskDescription = "Доставить груз через лес", reward = 800, isUrgent = true)
    )
    for (mission in missions) {
        mission.describe()
        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
        println()
    }
}
