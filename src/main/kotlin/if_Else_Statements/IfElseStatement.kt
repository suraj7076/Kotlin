package if_Else_Statements

fun main() {
    val a = 21
    val b = 33

    /**
     * val max: Int
     * if(a>b){
     * max = a
     * }
     * else {
     * max = b
     * }
     * println(max)
     */

    val max: Int = if(a>b){
        a
    }else {
        b
    }

    println(max)
}