fun main(args: Array<String>) {
    demo()                                 // Not passing any value during function call
    demo(99)                       //Passing value of some of the parameters during function call
    demo(99,'Z')               //Passing values of all the parameters during function call
    demo(ch='Z')                          /*As you can see we have overriden the default value of second parameter by using the parameter name during function call demo(ch='Z'). If we would have done this without named parameter like this demo('Z') then this would have thrown error because then it would have tried to override the first integer parameter with this value.*/
}
fun demo(number:Int= 100, ch: Char ='A'){
    println("Number is: $number and Character is: $ch")
}