package higherOrderFun

//Higher order function
fun main(){
    val function:(String, String) -> String = { name, obj ->
        "$name made $obj"
    }
    higherOrder("Suraj", "Kite", function)

    /*
    short form of above two line

    higherOrder("Suraj", "Kite", { name, obj ->
        "$name made $obj"
        })

    // another style:


    higherOrder("Suraj", "Kite") { name, obj ->
        "$name made $obj"
    }
     */
}

fun higherOrder(
    name: String, obj: String,
    function:(String, String) -> String): Unit{
    val result = function(name, obj)
    println(result)
}