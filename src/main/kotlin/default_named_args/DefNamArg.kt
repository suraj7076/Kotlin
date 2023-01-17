package default_named_args

fun main(){
    //checkParam(32, true)
    // someArg(true) it will show error
    //someArg(b = true) // it will work fine [IT IS NAMED ARG]
    //someArg(false) // it will work fine


}

fun checkParam(a: Int, b: Boolean){
    println("a: $a and b: $b")
}

//passing no argument in function call
fun noArg(a: Int = 44, b: Boolean = true){
    println("a: $a and b: $b")
}

//passing some argument in function call
fun someArg(a: Int = 44, b: Boolean){
    println("a: $a and b: $b")
}

fun someArg(l: Boolean, k: Int = 0){
    println("l: $l and k: $k")
}

// passing all argument in function call
fun allArg(l: Boolean = true, k: Int = 0){
    println("l: $l and k: $k")
}