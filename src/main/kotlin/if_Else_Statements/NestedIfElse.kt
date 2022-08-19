package if_Else_Statements

fun main(){
    val a = 32
    val b = 93

    if(a > b){
        println("$a is greather than $b")
    }
    else if(a<b){
        println("$b is greater than $a")
    }
    else{
        println("both are equal")
    }

    val num = 2
    when(num){
        0 -> print("val is 0")
        1 -> print("val is 1")
        2 -> print("val is 2")
        3 -> print("val is 3")
        else -> print("val is unknown")
    }

}