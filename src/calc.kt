import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter first number :")
    val firstNumber = input.nextInt()
    print("Enter second number :")
    val secondNumber = input.nextInt()
    print("Enter Action (+,-,*,/,%):")
    val operator = input.next()
    val result = when(operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> firstNumber / secondNumber
        "%" -> firstNumber % secondNumber

        else -> "Invalid"

    }
      println(result)









}