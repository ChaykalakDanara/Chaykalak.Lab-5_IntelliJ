package items

class Item(
    val name: String,
    val type: String,
    val value: Int
) {
    constructor(name: String, type: String) : this(name, type, 0)
    fun printInfo() {
        println("Название: $name, Тип: $type, Цена: $value")
    }
}