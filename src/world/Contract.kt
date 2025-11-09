package world

class Contract(
//    val clientname: String,
//    val taskDescription: String,
//    val reward: Int,
//    val isUrgent: Boolean = false
//    ){
//    fun printContractInfo(){
//        println("Заказчик: $clientname")
//        println("Задача: $taskDescription")
//        println("Награда: $reward")
//        println("${(isUrgent)"Срочно!"else "Обычный контракт"}")
//    }
    title: String,
    val clientName: String,
    val taskDescription: String,
    reward: Int,
    val isUrgent: Boolean = false
) : Mission(title, reward) {

    override fun describe() {
        println("Контракт от $clientName: $taskDescription (${if (isUrgent) "СРОЧНО" else "Обычный"}), награда: $reward")
    }
}