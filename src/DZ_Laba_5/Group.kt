package DZ_Laba_5

class Group {
    var groupName: String = "Без названия"
    val students = mutableListOf<Student>()

    init {
        println("Создана группа")
    }
    fun addStudent(student: Student) {
        students.add(student)
        println("Студент ${student.name} добавлен в группу $groupName")
    }
    fun listStudents() {
        println("\nСтуденты группы $groupName:")
        for (student in students) {
            student.introduce()
        }
    }
    fun celebrateBirthdays() {
        println("\nВ группе $groupName празднуют дни рождения!")
        for (student in students) {
            student.haveBirthday()
        }
    }
}