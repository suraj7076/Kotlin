package array

fun main(){
    var arr = arrayOf(2, 23,3)
    var arr2 = arrayOf<Long>(2, 23,3)
    //println(arr.contentToString())


    // create an array with size 8 and contain all value 2
    var arr3 = Array<Int>(8){2}
//    println(arr3.contentToString())


    /**
     * Create arrays:
     * To create arrays in Kotlin, you can use:
     *
     * functions, such as arrayOf(), arrayOfNulls() or emptyArray().
     *
     * the Array constructor.
     */

    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")

    // Using the += assignment operation creates a new riversArray,
    // copies over the original elements and adds "Mississippi"
    riversArray += "Mississippi"
    println(riversArray.joinToString())
    // Nile, Amazon, Yangtze, Mississippi


    // This example uses the arrayOf() function and passes item values to it:
    // Creates an array with values [1, 2, 3]
    val simpleArray = arrayOf(1, 2, 3)
    println(simpleArray.joinToString())
    // 1, 2, 3

    // This example uses the arrayOfNulls() function to create an array of a given size filled with null elements:
    // Creates an array with values [null, null, null]
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
    // null, null, null

    // This example uses the emptyArray() function to create an empty array :
    val exampleArray1 = emptyArray<String>()
    println(exampleArray1.size)

    //    You can specify the type of the empty array on the left-hand or right-hand side of the assignment due to Kotlin's type inference.
    //    For example:
    var exampleArray2 = emptyArray<String>()
    var exampleArray3: Array<String> = emptyArray()

    // Creates an Array<Int> that initializes with zeros [0, 0, 0]
    val initArray = Array(3) { 0 }
    println(initArray.joinToString())
    // 0, 0, 0

    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { index -> (index * index).toString() }
    asc.forEach { print(it) }
    // 014916

    // Creates a two-dimensional array
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())
    // [[0, 0], [0, 0]]

    // Creates a three-dimensional array
    val threeDArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(threeDArray.contentDeepToString())
    // [[[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]]]

    // Creates a four-dimensional array
    val fourDArray = Array(2){Array(2){Array(2){ Array<Boolean>(2){true} } } }
    println(fourDArray.contentDeepToString())


    // Arrays are always mutable
    val threeElementsArray = arrayOf(1, 2, 3)
    val temp = Array(2) { Array<Int>(2) { 0 } }

    // Accesses the element and modifies it
    threeElementsArray[0] = 10
    temp[0][0] = 2

    // Prints the modified element
    println(threeElementsArray[0].toString()) // 10
    println(temp[0][0].toString()) // 2

    // Arrays in Kotlin are invariant. This means that Kotlin doesn't allow you to assign an Array<String> to an Array<Any> to prevent a possible runtime failure. Instead, you can use Array<out Any>
    val a = Array<String>(2){index -> index.toString()}

    // val c: Array<Any> = a // error

    val b: Array<out Any> = a // correct
    println(a.contentDeepToString())
    println(b.contentDeepToString())


    // Pass variable number of arguments to a function
    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", *lettersArray)

    // Compare array
    // To compare whether two arrays have the same elements in the same order, use the .contentEquals() and .contentDeepEquals() functions:
    val oneArray = arrayOf(1, 2, 3)
    val anotherArray = arrayOf(1, 2, 3)

    // Compares contents of arrays
    println(oneArray.contentEquals(anotherArray))
    // true

    // Using infix notation, compares contents of arrays after an element
    // is changed
    oneArray[0] = 10
    println(oneArray contentEquals anotherArray)
    // false

    /**
     * Note: Don't use equality (==) and inequality (!=) operators to compare the contents of arrays. These operators check whether the assigned variables point to the same object.
     */

    // Transform arrays
    val sumArray = arrayOf(1, 2, 3)

    // Sums array elements
    println(sumArray.sum())
    // 6

    //Shuffle
    val shuffleArray = arrayOf(1, 2, 3)

    // Shuffles elements
    shuffleArray.shuffle()
    println(shuffleArray.joinToString())

    // Shuffles elements again
    shuffleArray.shuffle()
    println(shuffleArray.joinToString())

    /**
     * Convert to Map
     * To convert an array to a Map, use the .toMap() function.
     *
     * Only an array of Pair<K,V> can be converted to a Map. The first value of a Pair instance becomes a key, and the second becomes a value.
     */
    val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)

    // Converts to a Map
    // The keys are fruits and the values are their number of calories
    // Note how keys must be unique, so the latest value of "apple"
    // overwrites the first
    println(pairArray.toMap())
    // {apple=140, banana=150, cherry=90}


    // Primitive-type arrays
    // Creates an array of Int of size 5 with the values initialized to zero
    val exampleArray = IntArray(5)
    println(exampleArray.joinToString())
    // 0, 0, 0, 0, 0

}

fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        print(string)
    }
}