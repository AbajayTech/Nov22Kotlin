fun main(args: Array<String>) {
    //passing a function to another function
    func("BeginnersBook", ::demo)

    //function returns another function
    val sum = func(10)
    println("10 + 20: ${sum(20)}")

}
// definition for passing a function to another function
fun func(str: String, myfunc: (String) -> Unit) {
    print("Welcome to Kotlin tutorial at ")
    myfunc(str)
}
fun demo(str: String) {
    println(str)
}

//definition for function that  returns another function
fun func(num: Int): (Int) -> Int = {num2 -> num2 + num}