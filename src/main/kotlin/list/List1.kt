package list

fun main() {
    // Read below solution
    // Note: https://stackoverflow.com/questions/51718229/kotlin-val-mutablelist-vs-var-immutablelist-when-to-use-which


    var list1 : List<Int> = listOf(1,2,3,4,5)
    println(list1)
    println(list1[2])

//    you can't do because it is immutable
//    list1.set(0,20)
//    list1.add(32)
//    list.removeAt(1)

    var mutableList: MutableList<Int> = mutableListOf(1,2,3)

    mutableList.add(22)
    mutableList.add(232)
    mutableList.add(24)
    println(mutableList.removeAt(2))
}