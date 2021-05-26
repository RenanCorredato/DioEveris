package Modulo1
fun main() {
    val s = ""
    println(s.isEmpty())
    println(s.isBlank())
    println(s.isNullOrBlank() || s.isNotEmpty())

    val l = "     "
    println(l.isEmpty())
    println(l.isBlank())


    val empty = ""//empty e uma string tem tanho 0 e ela esta fazia
    println(empty.length)

    val blank = "                    " //blank e um string que tamanho maior que 0 e preencido com espaço
    println(blank.length)

    println(empty.isEmpty() && empty.isBlank())
    println(blank.isEmpty() && blank.isBlank())
    println(blank.isEmpty() || blank.isBlank())



}