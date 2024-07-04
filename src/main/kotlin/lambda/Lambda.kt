package lambda

fun addTwoNumLambda(a: Int, b: Int, myLambda: (Int) -> Unit){
    val add = a + b
    myLambda(add)
}

fun ad(a: Int, b: Int){
    val add = a + b
    println(add)
}

fun lambdaFun(input: Int): (Int) -> Boolean {
    return {number: Int -> number > input}
}

fun lambdaCall(
    lambdaParameter: (Int) -> Boolean = lambdaFun(0)
) {

}

fun main(){
    val myLambda: (Int) -> Unit = {it: Int -> println(it)}
    addTwoNumLambda(32,3, myLambda)

    val greaterThan5 = lambdaFun(input = 5)

    println(greaterThan5(6)) // true
    println(greaterThan5(2)) // false
}
