package Modulo2

fun main() {
    val values = intArrayOf(1,3,4,2,10,7)
    values.forEach {
        println(it)
    }

    println("------------------------")

    values.sort()
    values.forEach {
        println(it)
    }
}