package Modulo1

private fun getFullName(name:String, lastName:String):String{
    val fullName = "$name $lastName"
    return fullName
    }
private  fun getFullName1(name:String, lastName:String):String{
        return "$name $lastName"
}

private  fun getFullName2(name:String, lastName:String) = "$name $lastName" // funçoes single-line


//funçao ordem superior



fun main() {
    println(getFullName("Renan","Corredato"))
    println(getFullName1("Renan","Corredato"))
    println(getFullName2("Renan","Corredato"))

}