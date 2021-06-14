package Modulo2

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("------------------------")

    println("maior ${salarios.maxOrNull()}")
    println("Menor ${salarios.minOrNull()}")
    println("Media ${salarios.average()}")

    val salariosMairQue250 = salarios.filter { it > 2500.0 }
    println("------------------------")

    salariosMairQue250.forEach { println(it) }
    println("------------------------")

    println(salarios.count())
    println("------------------------")

    println(salarios.count { it in 2000.0..5000.0 })
    println("------------------------")

    println(salarios.find { it == 5000.0 })
    println("------------------------")

    println(salarios.find { it == 500.0 })
    println("------------------------")

    println(salarios.any { it == 1000.0 })
}