package extension_inline_Fun

fun main(){
    var str : String = "Suraj"
    println("Normal String : $str")

    // formatted String
    println("formatted String:\n"+str.formattedString())
}

// adding function in String class
// as we're defining outside class, we can't access it's class's private member
fun String.formattedString(): String{
    return "-------\n${this}\n-------"
}