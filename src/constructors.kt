class Employee(var firstname:String,var age:Int,var gender:String,var position:String,var salary:Double){

    fun role(task:String){

        println("The role is $task")

    }



}

fun main() {
    var employee1=Employee("Stephan",24,"Male","CEO",20000000.000)
    var employee2=Employee("John",34,"Male","Manager",150000.000)
    var employee3=Employee("Emmah",34,"Female","Programmer",150000.000)


 println(employee1.firstname)
    println("Employee is ${employee1.age} years old")
}

