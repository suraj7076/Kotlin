package array

fun main(){
    var arr = arrayOf(2, 23,3)
    var arr2 = arrayOf<Long>(2, 23,3)
    //println(arr.contentToString())


    // create an array with size 8 and contain all value 2
    var arr3 = Array<Int>(8){2}
    println(arr3.contentToString())


}