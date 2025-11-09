package world

fun main() {
    val quests = listOf(
        Quest(
            "Доставить посылку в соседний город",
            5,
            200,
            "Лёгкий",
            QuestType.DELIVERY
        ),
        Quest(
            "Охотиться на гоблинов",
            3,
            350,
            "Средний",
            QuestType.ELIMINATION
        ),
        Quest(
            "Сопроводить купца через лес",
            6,
            500,
            "Средний",
            QuestType.ESCORT
        ),
        Quest(
            "Исследовать древние руины",
            8,
            800,
            "Сложный",
            QuestType.EXPLORE
        ),
        Quest(
            "Победить дракона",
            12,
            2000,
            "Сложный",
            QuestType.BOSSFIGHT
        )
    )
    for (quest in quests) {
        quest.describe()
    }
    for (quest in quests) {
        if (quest.questType == QuestType.EXPLORE) {
            quest.printInfo()
        }
    }
    fun showOnlyExploreQuests(quests: List<Quest>) {
        for (quest in quests) {
            if (quest.questType == QuestType.EXPLORE) {
                quest.printInfo()
            }
        }
    }
    showOnlyExploreQuests(quests)
}