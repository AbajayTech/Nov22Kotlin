fun main(args: Array<String>) {
    var myarr = arrayOf("Erick", "Joan", "Daniel", 23, 45.5)

    var intarr= arrayOf<Int>(5,6)
    var floatarr= arrayOf<Float>(2.1F,3.2F)

    myarr[0]="Kamau"

    println("My name is "+myarr[0])
    println(intarr[0])
    println(floatarr[1])           /*to print an array you have to give the index
                                     but for list you just print directly*/

}