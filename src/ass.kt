import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter marks :")
    val marks = input.nextInt()
    val mark = when(marks){
      in 80..100 -> "A"
      in 60..79 -> "B"
      in 50..59 -> "C"
      in 40 ..49 -> "D"
      in 30..39-> "E"
      in 20..29 -> "F"

else -> "$marks is invalid marks"

    }
println(mark)
}