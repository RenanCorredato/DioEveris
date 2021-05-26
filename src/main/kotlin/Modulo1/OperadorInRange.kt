package Modulo1

// E(&&) OU(||)
const val MAXI_AGE = 68
const val MIN_AGE = 16


fun main() {
    val numbers = listOf(3,9,0,1,2)
    println(12 in numbers)
    println(12 in 0..20)

    val bingo = listOf(8,6,34,2,13)
    var number = (1..34).random()
    println(number)
    println(number in bingo)

    var age = (10..100).random()
    println(age)
    println(age in MIN_AGE .. MAXI_AGE)
    println(age >= MIN_AGE && age <= MAXI_AGE)
}
