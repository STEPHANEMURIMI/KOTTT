fun main() {
    var languages = arrayOf("Kotlin","Python","Java","PHP")
    println(languages[1])

    // value reassignment
    languages[1] = "C++"
    println(languages[1])

//Accessing elements

    for (x in languages){
        print(x)
    }



}