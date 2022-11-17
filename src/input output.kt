import java.util.Scanner
fun main(args: Array<String>) {
    print("Enter your Name: ")

    val myname= readln()
    println("My name is "+myname)

    print("Enter your Age: ")
    val myage= readln()
    println("My age is "+myage)

    //taking input and converting it to another type
    print("Write any number: ")

    val number = Integer.valueOf(readLine())
    println("The entered number is: $number")

    //Taking the input other than String using Scanner class
    //creating Scanner object
    val read = Scanner(System.`in`)

    //Taking integer input
    println("Enter an integer number: ")
    var num1 = read.nextInt()

    //Taking float input
    println("Enter a float number: ")
    var num2 = read.nextFloat()

    //Displaying input numbers
    println("First Input Number: "+num1)
    println("Second Input Number: "+num2)



}