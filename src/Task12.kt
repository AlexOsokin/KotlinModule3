fun main(args: Array<String>) {

    println("Введите год:")
    checkLeapYear(readLine().toString().toInt())
}

fun checkLeapYear(year: Int) {

    if (year % 4 != 0){
        println("Год '$year' не високосный")
        return
    } else if (year % 100 == 0 && year % 400 != 0){
        println("Год '$year' не високосный")
        return
    } else {
        println("Год '$year' високосный!!!")
    }
}