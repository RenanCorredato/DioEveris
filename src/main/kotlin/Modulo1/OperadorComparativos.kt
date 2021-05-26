package Modulo1

const val EQUAL = 0
const val Less = -1
const val More = 1

fun main() {
    val d = 220
    val t = d
    println(d > t)
    println(d.compareTo(t) == More)
    println(d >= t)
    println(d.compareTo(t) >= EQUAL)
    println(d == t)
    println(d.equals(t))
    println(!d.equals(t))



}