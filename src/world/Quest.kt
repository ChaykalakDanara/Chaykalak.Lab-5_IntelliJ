package world

class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String,
    val questType: QuestType
) : Mission(title, reward) {


    //    fun init(title: String, duration: Int, reward: Int, difficulty: String) {
//        this.title = title
//        this.duration = duration
//        this.reward = reward
//        this.difficulty = difficulty
//    }
    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
        println("Тип квеста: ${questType.description}")
    }

    fun goldPerHour(): Int {
        require(duration >= 0) { "Длительность не может быть отрицательной!" }
        return if (duration == 0) 0 else reward / duration
    }

    fun getReward(): Int{
        return 500
    }
    fun getDifficulty(): String = "Легкий"

    fun isHard(): Boolean{
        return  difficulty.lowercase() == "Сложный"
    }
    fun printInfo() {
        println("Название квеста: $title")
        println("Тип квеста: ${questType.description}")
        println("Время выполнения: $duration ч.")
        println("Награда: $reward золотых")
        println("Уровень сложности: $difficulty")
    }
}

