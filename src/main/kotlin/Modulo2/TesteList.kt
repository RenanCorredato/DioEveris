package Modulo2

fun main() {
    val joao = Funcionario("João", 1200.0, "CLT")
    val pedro = Funcionario("Pedro", 300.0, "PJ")
    val maria = Funcionario("Maria", 400.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach { println(it) }

    println("------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { print(it) }

    println("------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { print(it) }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """Nome: $nome
           |Salário: $salario    
           """.trimMargin()
}