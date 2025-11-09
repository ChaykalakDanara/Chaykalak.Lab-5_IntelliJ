package pets

fun main(){
//    val wolf = Wolf()
//    println(wolf.packSize)

    val pets = listOf(
        Wolf(name = "Фенрир"),
        Cat(name = "Мурзик"),
        Eagle(name = "Скайвинд"),
        Bear(name = "Балу")
    )
    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }
}