import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    print("Enter first Number: ")
    val firstNumber = input.nextInt()

    print("Enter second Number: ")
    val secondNumber = input.nextInt()

    print("Enter Action (+, -, *, /, %): ")
    val choice  = input.next()[0]

    val result  = when(choice){
        '+' -> firstNumber  + secondNumber
        '-' -> firstNumber  - secondNumber
        '*' -> firstNumber  * secondNumber
        '/' -> firstNumber  / secondNumber
        '%' -> firstNumber  % secondNumber
        else ->{
            System.err.println("Not a valid operation")       //writing a standard error stream
            return
        }
    }
    print(result)
}