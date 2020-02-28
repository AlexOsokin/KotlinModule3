fun main(args: Array<String>) {

    val cities = arrayOf("Россия", "Украина", "Белоруссия")

    val print = {array: Array<String> -> array.forEach{element -> println(element)}}
    print(cities)
}