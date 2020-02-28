fun main(args: Array<String>) {
    println("Колличество сотрудников: ${checkPersonCount("Александр", "Сергей", "Андрей")}")
}

fun checkPersonCount(vararg persons: String): Int {
    return persons.size
}