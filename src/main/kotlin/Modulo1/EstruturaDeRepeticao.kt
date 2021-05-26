package Modulo1

fun main() {

    letters()
  //for (i in 0..20 ){
    //  print("$i ")
      //resultado: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
  }
    fun downTo(){
        for (i in 20 downTo 0 ){
            print("$i ")
            // resultado: 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
        }
    }

    fun until(){
        for (i in 0 until 20 ){
            print("$i ")
            //resultado:0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
        }
    }

    fun step(num:Int){
        for (i in 0..20 step num ){
            print("$i ")
            //resultado:0 2 4 6 8 10 12 14 16 18 20
        }
    }

    fun letters(){
        var sArray = "Olha essa String"
        for (l in sArray ){
            print(l.toUpperCase())
        }
        //resultado:OLHA ESSA STRING

    }


