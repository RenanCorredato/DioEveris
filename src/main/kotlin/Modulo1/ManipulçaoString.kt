package Modulo1

fun main() {
    val s = "Olá mundo!"
    println(s[0])
    println(s.first())

    println(s[s.length - 1]) // -1 utlizado para acessar o ultilmo index
    println(s.last())

    val  welcome = "Bem vindo"
    var name = "renan"
    println("$welcome, ${name.capitalize()}")
    println("$welcome, ${name.toUpperCase()}")
    println("$welcome, ${name.toLowerCase()}")
    println("$welcome, ${name.decapitalize()}")
    println("$welcome, ${name.decapitalize()}")
    println("$welcome, ${name.replace("renan","maisa")}")






}