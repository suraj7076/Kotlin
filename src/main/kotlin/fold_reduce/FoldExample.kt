package fold_reduce

fun main() {
    /*
    Accumulates value starting with initial value and applying operation from left to right to current accumulator value and each element.

    Returns the specified initial value if the array is empty.
     */
    val list1 = listOf(1, 2, 3, 4, 5)
    val x = list1.fold(0){ acc, next -> acc + next }
    println(x)

    /*
    Here, we’ve provided an initial value.
    In contrast to reduce(), if the collection is empty, the initial value will be returned.
     */
    val list2 = listOf<Int>()
    val z = list2.fold(0){ acc, next -> acc + next }
    println(z)

    // signature of fold{}
    // inline fun <T, R> Iterable<T>.fold(initial: R, operation: (acc: R, T) -> R): R
    val list3 = listOf(1, 2, 3, 4, 5)
    val sum: Long = list3.fold(0L){ acc, next -> acc + next.toLong() }
    println(sum)


    /*
    In general, the ability to change the result type is a very powerful tool.
    For example, if we use the right result types,
    we can easily split the collection into even and odd numbers:
     */
    val list4 = listOf(13, 42, 323, 48, 56,91)
    val (even, odd) = list4.fold(Pair(mutableListOf<Int>(), mutableListOf<Int>())) { eoPair, number ->
        eoPair.apply {
            when (number % 2) {
                0 -> first += number
                else -> second += number
            }
        }
    }
    println("even $even and odd $odd")
}