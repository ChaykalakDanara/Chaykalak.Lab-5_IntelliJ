package characters

import world.Quest
import world.QuestType

class Trader(
    val name: String,
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun addQuest(quest: Quest) {
        quests.add(quest)
    }
    fun showAvailableQuests() {
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золота")
        }
    }
    fun giveQuest(index: Int): Quest? {
        if (index in 1..quests.size) {
            return quests[index - 1]
        } else {
            return null
        }
    }
    fun removeQuest(index: Int) {
        if (index in 1..quests.size) {
            quests.removeAt(index - 1)
        }
    }
    fun start() {
        while (true) {
            println("\nВыберите действие:")
            println("1 - Добавить квест")
            println("2 - Показать все квесты")
            println("3 - Взять квест (удалить из списка)")
            println("0 - Выйти")
            print("Ваш выбор: ")
            val choice = readln()
            if (choice == "1") {
                println("Введите название квеста: ")
                val title = readln()
                println("Введите длительность (часы): ")
                val duration = readln().toInt()
                println("Введите награду (золото): ")
                val reward = readln().toInt()
                println("Введите сложность: ")
                val difficulty = readln()
                println("Введите тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
                val typeInput = readln()
                val questType = QuestType.valueOf(typeInput)
                val newQuest = Quest(title, duration, reward, difficulty, questType)
                addQuest(newQuest)
                println("Квест '$title' добавлен.")

            } else if (choice == "2") {
                showAvailableQuests()

            } else if (choice == "3") {
                showAvailableQuests()
                println("Введите номер квеста для удаления: ")
                val index = readln().toInt()
                val quest = giveQuest(index)
                if (quest != null) {
                    removeQuest(index)
                    println("Квест '${quest.title}' удален.")
                } else {
                    println("Неверный номер квеста.")
                }
            } else if (choice == "0") {
                break
            } else {
                println("Некорректный ввод. Попробуйте снова.")
            }
        }
    }
}