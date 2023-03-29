package program


class Sample constructor(val a: Int, val b: Int) {
    // code
}

//class Sample(a : Int , b: Int) {
//    val p: Int
//    var q: Int
//    // initializer block
//    init {
//        p = a
//        q = b
//        println("The first parameter value is : $p")
//        println("The second parameter value is : $q")
//    }
//}

fun main() {
    println("Hi everyone ...")
    val s1 = Sample(1, 2)
    println("s1.a = ${s1.a} \ns1.b = ${s1.b}")
//    println("s1.p = ${s1.p} \ns1.q = ${s1.q}")
}
