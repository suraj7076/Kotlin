package com.surajmyt.regex

fun main() {
    regexExample1()
    regexExample2()
}

fun regexExample1() {
    val pattern = "\\d{3}-\\d{2}-\\d{4}"
    val input = "457-87-5786"
    val isMatch = Regex(pattern).matches(input)
    println(isMatch) // true
}

fun regexExample2() {
    val pattern = "\\w+"
    val input = "The quick brown fox"
    val match = Regex(pattern).find(input)
    if (match != null) {
        println(match.value)
        println(match.range)
    } // MatchResult(value=The, range=0..3)
}