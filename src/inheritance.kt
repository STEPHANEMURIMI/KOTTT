// Parent/base/super class
open class Animal{
    var age = 9
    var gender = " female"
fun move(movement:String){
    println("Animal is $movement")
}


}

//Child class
open  class Duck:Animal(){
    var color = "white"
    fun sound(){
        println("The duck is quacking")
    }
}


class Fish:Duck(){
    var scales = true
    var fins = true
    fun eat()
    {
        println("fish us eating")
    }
}



fun main(){
    var elephant = Animal()

    var duckling = Duck()
    duckling.move("swimming")
    println(duckling.color)
    var nileperch = Fish()
nileperch.sound()

}