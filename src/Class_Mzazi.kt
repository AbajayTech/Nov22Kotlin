
//inheritance
open class Class_Mzazi {                                 //keyword open makes this parent class
    var color ="followed mums color"
    var height="followed dads height"

}

class Njeri:Class_Mzazi(){
    fun female(){
        println("Njeri $color")
    }

}

class Kiprop:Class_Mzazi(){
    fun male(){
        println("Kiprop $height")
    }

}

 fun main(args: Array<String>) {
     val obj=Njeri()
     obj.female()

     val obj1=Kiprop()
     obj1.male()
 }