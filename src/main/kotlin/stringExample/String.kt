package com.surajmyt.stringExample

fun main() {
    val str = "abcd 123"

    println("Last char: " + str[str.length - 1])

    for (item in str) {
        print(item)
    }

    val string = "abcd"

    // Creates and prints a new String object
    println(string.uppercase())
    // ABCD

    // The original string remains the same
    println(string)
    // abcd

    // To concatenate strings, use the + operator. This also works for concatenating strings with values of other types, as long as the first element in the expression is a string
    val s = "abc" + 1
    println(s + "def")
    // abc1def

    //    val b = 1 + "abc" // not valid

    // Escaped strings
    val hello = "Hello, world!\n"

    // Multiline strings
    val text = """
        for (c in "foo")
            print(c)
    """

    println(text)


    // To remove leading whitespace from multiline strings, use the trimMargin() function:
    val textLines = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(textLines)

    val i = 10
    println("i = $i")
    // i = 10

    val letters = listOf("a","b","c","d","e")
    println("Letters: $letters")
    // Letters: [a, b, c, d, e]


    // an expression in curly braces:
    val length = "abc"
    println("$length.length is ${length.length}")
    // abc.length is 3


    val price = """
    ${'$'}_9.99
    """
    println(price)

    // Formats an integer, adding leading zeroes to reach a length of seven characters
    val integerNumber = String.format("%07d", 31416)
    println(integerNumber)
    // 0031416

    // Formats a floating-point number to display with a + sign and four decimal places
    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber)
    // +3.1416

    // Formats two strings to uppercase, each taking one placeholder
    val helloString = String.format("%S %S", "hello", "world")
    println(helloString)
    // HELLO WORLD

    // Formats a negative number to be enclosed in parentheses, then repeats the same number in a different format (without parentheses) using `argument_index$`.
    val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)
    println(negativeNumberInParentheses)
    //(31416) means -31416
}
