package Modulo2

fun main() {
    val joao = Funcionario("João", 1200.0, "CLT")
    val pedro = Funcionario("Pedro", 300.0, "PJ")
    val maria = Funcionario("Maria", 400.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.finById(joao.nome))

    println("------------------------")
    repositorio.findAll().forEach { println(it) }

    println("------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}