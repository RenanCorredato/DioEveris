package Modulo1

fun main() {
    val grade = (0..10).random()
    println(grade.getStudentStatus())

}

fun Int.getStudentStatus():String{
    println("nota $this")
    return when(this){
        in 0..4->"Reporvado"
        in 5..7->"mediano"
        in 8..9->"Bom"
        10->"Execelente"
        else ->"Indefinido"
    }
}

