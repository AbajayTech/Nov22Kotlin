fun main(args: Array<String>) {
    //lambda function outlook
    //{my_var -> actual_code_implementation}
    //lambda function
    val sum = {num1: Int, num2: Int -> num1 + num2}
    println("10+5: ${sum(10,5)}")
}