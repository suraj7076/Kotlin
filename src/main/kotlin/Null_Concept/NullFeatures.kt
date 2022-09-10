package Null_Concept

fun main(){
    // var str : String = null      // this is an error
    var str : String? = null
    //println(str.length)       it will show error
    println(str?.length)

    /**
     * use of elvis operator
     */

    //we can print default value using elvis operator (?:)
    println(str?.length?:"This is null")



    /**
     * USE OF filterNotNull()
     *
     * it will print all values except null
     */

    val list = listOf("1",2,null,'3', null,4.23,null, 5.43f,33333)
    val arrayList = arrayListOf("1",2,null,'3',null, 4.23,null, 5.43f,33333)

    println("list without null: ${list.filterNotNull()}")
    print("arrayList without null : ${arrayList.filterNotNull()}")
}