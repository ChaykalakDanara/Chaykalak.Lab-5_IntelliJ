package magic

class Spell(
    val name: String = "",
    val width: Int = 0,
    val height: Int = 0,
    val symbol: String = ""
) {
    constructor(name: String, size: Int, symbol: String) :
            this(name, width = size, height = size, symbol)

    fun cast() {
        println("Кастуем $name!")
        repeat(times = height) {
            repeat(times = width) {
                print(symbol)
            }
            println()
        }
    }
    fun area(): Int {
        return width * height
    }
    fun description(): String {
        return "Заклинание $name занимает область ${width}x$height и использует символ $symbol"
    }
}