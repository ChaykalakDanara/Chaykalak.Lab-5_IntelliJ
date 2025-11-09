package items

fun main() {
    println("=== ТЕСТИРОВАНИЕ КЛАССА ITEM ===")

    val sword = Item("Меч дракона", "оружие", 1000)
    val potion = Item("Зелье здоровья", "зелье")

    sword.printInfo()
    potion.printInfo()
}