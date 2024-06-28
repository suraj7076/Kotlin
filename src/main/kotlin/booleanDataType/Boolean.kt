package com.surajmyt.booleanDataType

fun main() {
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    // true
    println(myTrue && myFalse)
    // false
    println(!myTrue)
    // false
    println(boolNull)
    // null

    val nullableBoolean: Boolean? = true
    println(!nullableBoolean!!)

    val variable: Boolean? = null
    println("Result")

    try {
        println(!variable!!)
    }catch (e: Exception) {
        println(e)
    }

}