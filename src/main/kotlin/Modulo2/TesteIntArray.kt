package Modulo2

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor)
    }
    println("------------------------")

    values.forEach { valaor ->
        println(valaor)
    }

    println("------------------------")

    for (index in values.indices) {
        println(values[index])
    }

    println("------------------------")

    values.sort()
    for (valor in values) {
        println(valor)
    }

}