package files

import java.io.File

fun main() {
//    val file = File("demo.txt")
//    println("Создаем файл")
//    file.appendText(text = "Новая строка\n")
//    file.writeText(text = "Hello")
//    println("\nСодержание файла: ")
//    println(file.readText())
//    println("Считываем файл")
//    val lines = file.readLines()
//    for((index, lines) in lines.withIndex()){
//        println("${index + 1}: $lines")
//    }
//    val file  = File(pathname = "toDo.txt")
//    println("Добро пожаловать в To-Do приложение!")
//    while (true){
//        print("Введите заданчу (или 0 для входа): ")
//        val userInput = readln()
//
//        if (userInput == "0") {
//            break
//        } else {
//            file.appendText(text = "$userInput\n")
//            println("Задача сохранена!")
//        }
//        println("\nВаш список задач: ")
//        println(file.readText())
//    }
    val file = File("toDo.txt")

    while (true) {
        println("\n=== МЕНЮ ЗАДАЧ ===")
        println("1 - Добавить задачу")
        println("2 - Показать все задачи")
        println("3 - Удалить задачу")
        println("0 - Выход")
        print("Выберите действие: ")

        when (readln()) {
            "1" -> {
                print("Введите новую задачу: ")
                val task = readln()
                file.appendText(text = "$task\n")
                println("Задача добавлена.")
            }
            "2" -> {
                println("Все задачи:")
                if (file.exists() && file.readLines().isNotEmpty()) {
                    file.readLines().forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                } else {
                    println(" ! Список задач пуст.")
                }
            }
            "3" -> {
                val tasks = file.readLines().toMutableList()
                if (tasks.isEmpty()) {
                    println("Список задач пуст.")
                } else {
                    println("Задачи для удаления:")
                    tasks.forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                    print("Введите номер задачи для удаления: ")
                    val num = readln().toIntOrNull()
                    if (num == null || num !in 1..tasks.size) {
                        println("Некорректный номер.")
                    } else {
                        val removed = tasks.removeAt(num - 1)
                        file.writeText(text = "")
                        tasks.forEach { file.appendText(text = "$it\n") }
                        println("Задача \"$removed\" удалена.")
                    }
                }
            }
            "0" -> {
                println("Выход из программы")
                break
            }
        }
    }
}