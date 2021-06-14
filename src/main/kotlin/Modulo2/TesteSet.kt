package Modulo2

fun main() {
    val joao = Funcionario("João", 1200.0, "CLT")
    val pedro = Funcionario("Pedro", 300.0, "PJ")
    val maria = Funcionario("Maria", 400.0, "CLT")


    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("------------------------")
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtrac = funcionario3.subtract(funcionario2)
    resultSubtrac.forEach { println(it) }

    println("------------------------")

    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }
}