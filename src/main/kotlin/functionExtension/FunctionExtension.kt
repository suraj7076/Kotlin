package functionExtension

class DemoClass{
    var str: String? = null
    fun printStr() {
        println(str)
    }
}

fun main() {
    val obj1 = DemoClass()
    obj1.str = "Suraj"

    val obj2 = DemoClass()
    obj2.str = "Maity"

    val name = DemoClass()
    name.str = obj1.addTwoStr(obj2)

    name.printStr()

}

// Function Extension
fun DemoClass.addTwoStr(obj: DemoClass) = this.str + " " + obj.str