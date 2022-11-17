class Class_Name {
    var Salute:String="Ray"
    var Salute2:String="Abajila"

    fun Masari():String{
        return Salute+" "+Salute2
    }

}


fun main(args: Array<String>) {
    val obj=Class_Name()
    println("My name   is ${obj.Masari()}")
    println("My name first name is ${obj.Salute} and my last name is ${obj.Salute2}")

}