package kotlinBasics

fun main(){
    val a = 21
    val b = 33
    val max: Int = if(a>b){
        a
    }else {
        b
    }

//    println(max)

    for(x in 1..10 step 2) {
//        println(x)
    }

    for(x in 10 downTo 1 step 2) {
//        println(x)
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
//        .forEach { println(it) }

    val returnLength = getStringLength("134")
//    print(returnLength)

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["A"])
    for ((k, v) in map) {
        println("$k -> $v")
    }
}

fun getStringLength(obj: Any): Int? {

    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}
