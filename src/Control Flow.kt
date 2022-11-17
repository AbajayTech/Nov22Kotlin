fun main(args: Array<String>) {
    var num = 65
    if (num <= 65) {
        println("Proceed to next level")
    } else {
        println("Try again in three months")
    }

    var marks = 120
    if (marks < 40) {
        println("You have failed!")
    } else if (marks >= 40 && marks <= 60) {
        kotlin.io.println("You have a Pass!")

    } else if (marks > 60 && marks <= 80) {
        println("You have a Credit!")
    } else if (marks > 80 && marks <= 100) {
        println("You have a distinction")

    } else {
        println("Error enter valid marks!")
    }


    //nested expression
    val nambari = 101
    if (num < 0)
        println("Negative Number")
    else {
        //Nested expression
        if (num % 2 == 0)
            println("Even Number")
        else
            println("Odd Number")
    }

    //when expression(behaves more like switch statement)
    var ch = 'E'           //single quotes on character
    when (ch) {

        'A' -> println("A is a Vowel")
        'E' -> println("E is a Vowel")
        'I' -> println("I is a Vowel")
        'O' -> println("O is a Vowel")
        'U' -> println("U is a Vowel")

        else -> println("$ch is a Consonant")
    }
    var vow = 'D'

    when (vow) {

        'A', 'E', 'I', 'O', 'U' -> println("$vow is a Vowel")

        else -> println("$vow is a Consonant")
    }
    //Kotlin when expression with ranges
    var nambari1 = 78

    when (nambari1) {
        in 1..9 -> println("$nambari1 is a single digit number")
        in 10..99 -> println("$nambari1 is a two digit number")
        in 100..999 -> println("$nambari1 is a three digit number")
        else -> println("$ has more than three digits")
    }
    //Arithmetic operation inside when expression
    var age = 16

    when (age) {
        in 1..17 -> {
            val num = 18 - age
            println("You will be eligible for voting in $num years")
        }

        in 18..100 -> println("You are eligible for voting")
    }

    //simple for loop
    for (n in 10..15) {
        println("Loop: $n")
    }

    //Kotlin for loop using Array
    val myArray = arrayOf("ab", "bc", "cd", "da")
    for (str in myArray) {
        println(str)
    }
    //for loop iterating though array indices
    val myArray1 = arrayOf("Steve", "Robin", "Kate", "Lucy")
    for (n in myArray.indices) {
        println("myArray1[$n]: ${myArray1[n]}")
    }
    //Function withIndex() in for loop
    val myArray2 = arrayOf("Steve", "Robin", "Kate", "Lucy")
    for ((index, value) in myArray2.withIndex()) {
        println("Value at Index $index is: $value")
    }
    //while loop
    var nambari2 = 10

    while (nambari2 >= 5) {
        println("Loop: $nambari2")
        nambari2--
    }

    //do while loop
    var nambari3 = 100
    do {
        println("Loop: $nambari3")
        nambari3++
    } while (nambari3 <= 105)

    //A do-while loop at least run once
    var nambari4 = 110
    do {
        println("Loop: $nambari4")
        nambari4++
    } while (false)

    //Kotlin Continue For loop
    for (n in 1..5) {
        println("before continue, Loop: $n")
        if (n == 2 || n == 4)                              //  || together with &&    both mean and in kotlin
            continue

        println("after continue, Loop: $n")

    }
    //Kotlin continue example: displaying even numbers
    for (i in 1..10) {
        if (i % 2 != 0)
            continue

        println("$i")
    }
    //Nested loop example without continue label
    for (x in 'A'..'D') {
        for (n in 1..4) {
            if (n == 2 || n == 4)
                continue

            println("$x and $n")
        }
    }
    //Nested loop example with continue label
    myloop@ for (x in 'A'..'D') {
        for (n in 1..4) {
            if (n == 2 || n == 4)
                continue@myloop

            println("$x and $n")
        }

     }

     //kotlin break example
    for(n in 1..10){
        println("before break, Loop: $n")
        if (n==5) {
            println("I am terminating loop")
            break
        }
    }
     //break example in nested loop
    for(ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")
            if(n==2)
                break
        }
    }
    //kotlin break labels
    myloop@ for(ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")
            if(n==2)
                break@myloop
        }
    }

}