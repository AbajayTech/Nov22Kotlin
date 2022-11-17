fun main(args: Array<String>) {
    println("Number Range")

    for(nambari in 3..12){             //the two dots is the syntax for the range

        println(nambari)
    }

    println("Character Range")
    for(character in 'A'..'J'){
        println(character)
    }

    //reversing range
    val twototen=2..10
    for (n in twototen.reversed()){                  //the dot(.)/period is method of accessing inbuilt functions
        println(n)
    }
}
