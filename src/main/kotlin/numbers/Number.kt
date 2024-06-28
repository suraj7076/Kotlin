package com.surajmyt.numbers

fun main() {
    // Integer types
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    // Floating-point types
    val pi = 3.14 // Double
//    val one: Double = 1 // Error: type mismatch
    val oneDouble = 1.0 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
//    print(eFloat)

    fun printDouble(d: Double) { print(d) }

    val i = 1
    val d = 1.0
    val f = 1.0f

//    printDouble(d)
//    printDouble(i) // Error: Type mismatch
//    printDouble(f) // Error: Type mismatch

    // Literal constants for numbers
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


//    println(bytes)


    // Numbers representation on the JVM
    val number: Int = 10000
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number

//    println(boxedNumber == anotherBoxedNumber)

    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

//    println(boxedA === anotherBoxedA) // true
//    println(boxedB === anotherBoxedB) // false
//    println(boxedB == anotherBoxedB) // true


    // Explicit number conversions
    // Hypothetical code, does not actually compile:
//    val z: Int? = 1 // A boxed Int (java.lang.Integer)
//    val zz: Long? = z // Implicit conversion yields a boxed Long (java.lang.Long)
//    print(z == zz) // Surprise! This prints "false" as Long's equals() checks whether the other is Long as well

    // smaller types are NOT implicitly converted to bigger types.
    val byteValue: Byte = 1 // OK, literals are checked statically
// val i: Int = b // ERROR
    val i1: Int = b.toInt()

    val l = 1L + 3 // Long + Int => Long


    // Operations on numbers
//    println(1 + 2)
//    println(2_500_000_000L - 1L)
//    println(3.14 * 2.71)
//    println(10.0 / 3)

//    val x = 5 / 2
//println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
//    println(x == 2)

//    val x = 5L / 2
//    println(x == 2L)

//    val x = 5.toDouble() / 2
//    println(x)
//    println(x == 2.5)

    //Bitwise operations
    val x = (1 shl 2) and 0x000FF000
//    println(x)
//    println(-0.0 == 0.0) // true



    // Operand statically typed as floating-point number
    println(Double.NaN == Double.NaN)                 // false
// Operand NOT statically typed as floating-point number
// So NaN is equal to itself
    println(listOf(Double.NaN) == listOf(Double.NaN)) // true

// Operand statically typed as floating-point number
    println(0.0 == -0.0)                              // true
// Operand NOT statically typed as floating-point number
// So -0.0 is less than 0.0
    println(listOf(0.0) == listOf(-0.0))              // false

    println(listOf(Double.NaN, Double.POSITIVE_INFINITY, 0.0, -0.0).sorted())
// [-0.0, 0.0, Infinity, NaN]
}
