package stringExample


fun main(){
    /*
    A String can be simply declared within double quote (" ") known as escaped string
    or triple quote(""" """) known as raw string.

     */
    var str = "Hello"

    println(str.length) // It returns the length of string sequence.
    println(str.indices) //It returns the ranges of valid character indices from current char sequence.
    println(str.lastIndex) //It returns the index of last character from char sequence.
    println(str.compareTo("Hello")) // It returns zero if current is equals to specified other object.
    println(str.get(1)) // println(str[1]) // It returns the character at given index from the current character sequence.
    println(str.plus(" Brother")) // It returns the concatenate string with the string representation of the given other string.
    println(str.subSequence(1, 4)) // It returns the new character sequence from current character sequence, starting from startIndex to endIndex - 1.
    println(str.contains("hE", true))   // It returns true if the character sequence contains the other specified character sequence.
    println(str.count()) // It returns the length of char sequence.
    println(str.drop(2))    // It returns a string after removing the first n character.
    println(str.dropLast(3)) // It returns a string after removing the last n character.

    val str1 = "@sfwew3<<<#@First Grade$#@!>>>"
    val str2 = "@sfwew3<<<#@First Grade$#@!>>>"
    println(str1.dropWhile { !it.isLetter() })  // It returns a character sequence which contains all the characters, except first characters which satisfy the given predicate.
    println(str2.dropLastWhile { !it.isLetter() })   // It returns a character sequence which contains all the characters, except last characters which satisfy the given predicate.






    println(str.elementAt(1))   // It returns a character at the given index or throws an IndexOutOfBoundsException if the index does not exist in character sequence.
    println(str.indexOf('l', 3, false))   // It returns the index of first occurrence of the given character, starting from the given index value.
    //println(str.indexOfFirst {  })
    println()
    println()
    println()
    println()
    println()
}