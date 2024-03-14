class Person{

    //attributes/Properties
    var name = "Emmah"
    var age = "21"
    var gender = "Female"
   //Behavior/Method
    fun walk(){
        println("Person is walking")
    }

}

fun main() {
    var doctor = Person()
    println(doctor.name)
    doctor.walk()
}