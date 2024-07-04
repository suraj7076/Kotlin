package com.surajmyt.typecasts

fun main() {
    val obj = "Hello"
    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) { // Same as !(obj is String)
        print("Not a String")
    } else {
        println(obj.length)
    }

    checkString("11")

    // Control flow
    controlFlow(IntArray(5){indexValue -> indexValue + 1})
    controlFlow(true);

    val kitty = Cat()
    petAnimal(kitty)

    // Logical operators
    logicalOperatorSmartCast("1");


}

interface Status {
    fun signal() {}
}

interface Ok : Status
interface Postponed : Status
interface Declined : Status

fun signalCheck(signalStatus: Any) {

    // If you combine type checks for objects with an or operator (||), a smart cast is made to their closest common supertype:

    if (signalStatus is Postponed || signalStatus is Declined) {
        // signalStatus is smart-cast to a common supertype Status
        signalStatus.signal()
    }
}

fun logicalOperatorSmartCast(x: Any) {
    // x is automatically cast to String on the right-hand side of `||`
    if (x !is String || x.length == 0) return

    // x is automatically cast to String on the right-hand side of `&&`
    if (x is String && x.length > 0) {
        print(x.length) // x is automatically cast to String
    }
}

fun checkString(x: Any) {

    if (x !is String) return

    println(x.length) // x is automatically cast to String

//    if (x is String) {
//        println(x.length) // x is automatically cast to String
//    }

}

fun controlFlow(x: Any) {
    when (x) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> println(x.sum())
        else -> println("Not a Int, String and IntArray")
    }
}

class Cat {
    fun purr() {
        println("Purr purr")
    }
}

fun petAnimal(animal: Any) {
    val isCat = animal is Cat
    if (isCat) {
        animal.purr()
    }
}