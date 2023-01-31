package try_catch

fun main(){

    try {
        val data = 5 / 0
        println(data)
    } catch (e: NullPointerException) {
        println(e)
    } finally {
        println("finally block always executes")
    }
    println("below codes...")

    /*
    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    }
    catch (e: Exception) {
        println("parent")
    }
    catch (e: ArithmeticException) {
        println("arithmetic exception")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index out of bounds exception")
    }

    println("code after try catch...")

     */
}