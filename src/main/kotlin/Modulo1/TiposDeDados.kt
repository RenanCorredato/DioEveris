package Modulo1

const val MAX_AGE = 68 // valor imutavel

fun main() {
    println(Int.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)

    var currentAge:Int
    currentAge = 90
    println(currentAge > MAX_AGE)
    println(MAX_AGE)

    var currentYear = "que ano hein?"
    currentYear = 2021.toString() + "Vai ser melhor" // convertendo o tipo da variavel
    println(currentYear)

}