package lambda

fun main(){
    val myLambda: (Int) -> Unit = {it: Int -> println(it)}
    addTwoNumLambda(32,3, myLambda)
}
fun addTwoNumLambda(a: Int, b: Int, myLambda: (Int) -> Unit){
    val add = a + b
    myLambda(add)
}

fun ad(a: Int, b: Int){
    val add = a + b
    println(add)
}