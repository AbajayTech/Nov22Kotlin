fun main(args: Array<String>) {
     //standard library function example
    var num = 16
    println("Square root of $num is: ${Math.sqrt(num.toDouble())}")


    /*user defined function example
    created the function*/

    fun sayHello(){
        println("Hello")
    }

    //Calling the function
    sayHello()

    fun hesabu(){           //function by default is public you can call it on any kotlin file,but if you put it private it will only be on this file
        var n1=48
        var n2=7
        println("The sum of $n1 and $n2 is "+(n1+n2))
    }
    hesabu()

    var Sari="Ray"
    fun jina(){
        println("My name is "+Sari)
    }
    jina()


    /*user defined functions with arguments and return
    syntax:
    fun function_name(param1: data_type, param2: data_type, ...): return_type*/

    fun myFunction (fName:String,lName:String,yReg:Int){           //(class example)
        println(fName+" "+lName+""+yReg)
    }
    myFunction("Erick","Were",2022)          //here you just input your details directly

    //created the function
    fun sum(vararg numbers:Int): Int{
        var sum=0
        numbers.forEach {num-> sum+= num}
        return sum

    }
    //calling the function
    println("The Sum is: ${sum(10,20,30,40)}")

    //kotlin inline functions
    val sum= {num1:Int, num2:Int ->num1+num2}

    println("6+4=${sum(6,4)}")



    //kotlin recursion
    fun myfunction(){
        /*some code

        myfunction() calling myfunction()*/                      //A function is called recursive function if it calls itself and this process is called recursion.

        myfunction()
    }
    print("Enter a positive integer number: ")
    val number: Int =Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of $number = $factorial")

         //Tail Recursion Example
    val n = 6
    val factor = fact(number)
    println("Factorial of $number = $factorial")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}


//recursive function
fun fact(num: Int): Int {
    return if (num == 1) {
        num
    } else {
        //function fact() calling itself
        num * fact(num - 1)
    }
}

