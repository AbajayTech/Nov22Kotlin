import java.lang.ArithmeticException

fun main(args: Array<String>) {
    try {

        var num = 10 / 0
        println(num)


    }catch (e: ArithmeticException){
        println("Arithmetic Expression")            //specific for arithmetic exception
    }catch (e:Exception){
        println(e)                                  //for general exception
    }finally {
        println("It will print in any case.")
    }

    //Kotlin try block with no catch blocks
    try{
        var num = 10/5
        println(num)
    } finally{
        println("Finally block")
    }

    println("Out of try catch block")

    //Kotlin multiple catch blocks example
    try{
        var num = 10/0
        println(num)
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some Exception occurred")      //The exception occurred here is Arithmetic exception, however the first two catch blocks didn’t handle the Arithmetic exception thats why the third catch block’s code executed. Third block is handling all the exceptions because it is using the Exception class which is a parent of all the exception classes.its good practise to put parent try block in the last block
    }

    println("Out of try catch block")

    //Another example of multiple catch blocks
    try{
        val a = IntArray(5)
        a[10] = 99
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some error occurred")
    }

    println("Out of try catch block")

         //Nested Try-Catch Block example
    try {
        val num = 100 / 5
        println(num)
        try {
            val num2 = 100 / 0
            println(num2)
        }
        catch(e: NumberFormatException){
            println("Number Format Exception")
        }
    }
    catch(e: ArithmeticException){
        println("Arithmetic Exception")
    }

   // Kotlin throw keyword example
    print("Enter your name: ")
    val name = readLine()

    try{
        if (name == "Abajila"){
            throw Exception("You don't have access")
        }
        else
        {
            println("Welcome! You have access")
        }
    }
    catch (e: Exception){
        println(e.message)
    }

       //Kotlin try as an expression example


}
