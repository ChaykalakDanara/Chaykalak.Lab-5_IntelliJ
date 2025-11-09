package DZ_Laba_5

fun main() {

    // Задание 1
    val crossbow = Weapon()
    crossbow.name = "Арбалет"
    crossbow.damage = 30
    crossbow.durability = 150
    crossbow.type = "Охотничье"

    crossbow.showInfo()
    crossbow.use()
    crossbow.upgrade(13)
    crossbow.showInfo()

    println("\n" + "=".repeat(50) + "\n")

    // Задание 2
    val student = Student()
    student.name = "Natasha"
    student.age = 18
    student.introduce()
    student.haveBirthday()

    println("\n" + "=".repeat(50) + "\n")

    // Задание 3
    val stud1 = Student()
    stud1.name = "Антон"
    stud1.age = 19
    val stud2 = Student()
    stud2.name = "Юлия"
    stud2.age = 20
    val group = Group()
    group.groupName = "ИСП-231"
    group.addStudent(stud1)
    group.addStudent(stud2)
    group.listStudents()
    group.celebrateBirthdays()
    group.listStudents()

    println("\n" + "=".repeat(50) + "\n")

    // Задание 4
    val calculate = GeometryCalculator()

    println("=== ПРЯМОУГОЛЬНИКИ ===")
    calculate.rectangleInfo(7, 5)
    calculate.rectangleInfo(3, 6)

    println("=== ТРЕУГОЛЬНИКИ ===")
    calculate.triangleInfo(3, 4, 5)
    calculate.triangleInfo(5, 7, 3)

    println("=== ОКРУЖНОСТИ ===")
    calculate.circleInfo(5.0)
    calculate.circleInfo(7.0)
}