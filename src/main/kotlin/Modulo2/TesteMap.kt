package Modulo2

fun main() {
    val pair: Pair<String, Double> = Pair("Renan", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - valor: $v") }
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maisa" to 3500.0
    )

    map2.forEach { (k, v) -> println("Chave: $k - valor: $v") }
}