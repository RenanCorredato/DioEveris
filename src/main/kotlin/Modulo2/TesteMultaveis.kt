package Modulo2

fun main() {

    val joao = Funcionario("João", 1200.0, "CLT")
    val pedro = Funcionario("Pedro", 300.0, "PJ")
    val maria = Funcionario("Maria", 400.0, "CLT")

    println("-------------List-----------")
    val fucionarios = mutableListOf(joao,maria)
    fucionarios.forEach{ println(it)}

    println("------------------------")
    fucionarios.add(pedro)
    fucionarios.forEach{ println(it)}

    println("------------------------")
    fucionarios.remove(joao)
    fucionarios.forEach{ println(it)}

    println("-------------SET-----------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}