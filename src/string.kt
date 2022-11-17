fun main(args: Array<String>) {
    /**
     * These Strings are Immutable which
     * means they are read-only and
     * unchangeable
     */
    val website = "BeginnersBook"

    /**
     * This is how we declare long strings
     */
    val longString = """Welcome to
        Beginnersbook.com"""


    /**
     * Mutable Strings
     */
    var name = "Ray"
    var lName = "Abajila"
    name = name + " " + lName
    println(" My Name is: $name")


    //length of string
    var firstName = "Ray"

    /**
     * String interpolation
     */
    println("String Length: ${firstName.length}")

    /**
     * Or you can display like this
     */
    println("String Length: " + firstName.length)


    //comparing strings
    var str1 = "BeginnersBook"
    var str2 = "beginnersbook"

    /**
     * true if equals, otherwise false
     */
    println("String Equals? : ${str1.equals(str2)}")

    /**
     * 0 if equals, otherwise false
     */
    println("String Equals? : ${str1.compareTo(str2)}")


    //access character of string at a specific index
    var str = "Abajila"

    println(" The 3rd Index is: ${str.get(3)}")

    /**
     * Another way of doing the same
     * This is the recommended way
     */
    println(" The 3rd Index is: ${str[3]}")


    //substring
    var word = "BeginnersBook"

    /**
     * Here fromIndex is inclusive and
     * toIndex is exclusive which means
     * 5th index char will not be included
     */
    println("Index from 2 to 5: " + word.subSequence(2,5))

    //check whether string contains another string
    var webpage = "beginnersbook.com"

    println("Contains .com: ${webpage.contains(".com")}")


}