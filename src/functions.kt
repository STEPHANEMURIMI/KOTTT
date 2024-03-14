fun main() {
    //Predefined functions
    var y = Math.sqrt(169.0)
    println("The square root is $y ")


    var x = Math.min(45,12)
    println("$x is the minimum value")


    var z = Math.max(45,12)
    println("$z is the maximum value")



   var i = Math.round(67.45)
    println("$i is the rounded  value")

name()
quotient(20,5)
developers("john",24)
developers("Mary",34)
developers("Emmah",19)





}
//user defined functions
fun name (){
    println("Stephan")
}

fun quotient(num1:Int,num2: Int){

    println(num1/num2)
}
fun developers (name:String,age:Int){
 println("$name is $age years old")
}