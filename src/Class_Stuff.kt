//constructor
class Class_Stuff (val name:String,val jobdescription:String, val doe:Int){

}

fun main(args: Array<String>) {
    val obj=Class_Stuff("John","Lecturer",2022)

    println("Staff Name is ${obj.name},the job description is ${obj.jobdescription} and was employed in ${obj.doe}")
}