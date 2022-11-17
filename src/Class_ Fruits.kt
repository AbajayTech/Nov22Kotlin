class fruits {
    var price=0
    var namefruit=""
    var color=""
}

fun main(args: Array<String>) {
    //create an object
    val myobj=fruits()
    myobj.price=23
    myobj.namefruit="Banana"
    myobj.color="Yellow"
    println(myobj.price)
    println("My favourite fruit is ${myobj.namefruit} and it is ${myobj.color} in color and it costs KSH ${myobj.price}")
}