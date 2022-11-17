class Class_Hisabati {
    //Data members
    var num1:Int=7
    var num2:Int=9

    //member function
    fun calculateproduct():Int{
        return num1*num2
    }
    fun calculatesum():Int{
        return num1+num2
    }
}

fun main(args: Array<String>) {
    val obj=Class_Hisabati()
    println(obj.calculateproduct())
    println("The product of 7 and 9 is ${obj.calculateproduct()}")
    println("The sum of 7 and 9 is ${obj.calculatesum()}")
}
