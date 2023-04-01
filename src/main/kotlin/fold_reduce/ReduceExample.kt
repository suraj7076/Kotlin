package fold_reduce

fun main() {
    /*
    The reduce() method transforms a given collection into a single result.
    It takes a lambda function operator to combine a pair of elements into a so-called accumulated value.

    It then traverses the collection from left to right and stepwise combines the accumulated value with the next element.
     */
    val list1 = listOf(1, 2, 3, 4, 5)
    val x = list1.reduce { element, ans -> element + ans }
    println(x)

    // What would happen in the case of an empty list?
    // Note: reduce() throws a RuntimeException:
    val list2 = listOf<Int>()
    //val z = list2.reduce { element, ans -> element + ans }


}