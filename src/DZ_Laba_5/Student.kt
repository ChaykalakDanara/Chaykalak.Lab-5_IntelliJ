package DZ_Laba_5

class Student {
    var name: String = "Неизвестно"
    var age: Int = 0
    init {
        println("Создан студент")
    }
    fun introduce() {
        println("Меня зовут $name, мне $age лет")
    }
    fun haveBirthday() {
        age += 1
        println("$name празднует день рождения! Теперь ему $age лет")
    }
}