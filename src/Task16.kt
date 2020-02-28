import kotlin.math.sqrt

fun main(args: Array<String>) {

    fun Double.sqrt() = sqrt(this)

    val value = 5.45
    println("Квадратный корень из $value равен ${value.sqrt()}")
}