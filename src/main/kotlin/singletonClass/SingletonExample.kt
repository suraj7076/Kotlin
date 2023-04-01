package singletonClass
/*
    Singleton Class in Kotlin is also called as the Singleton Object in Kotlin.
    Singleton class is a class that is defined in such a way that
    only one instance of the class can be created and used everywhere.
 */
class NormalClass {

}
object SingletonClass1 {

}

object SingletonClass2 {
    init {
        println("Singleton Class 2 invoked.")
    }
    var name = "This is the variable name of SingletonClass2"
    fun add(a: Int, b: Int) = a + b
}
fun main() {
    // Here, two objects of NormalClass will be created
    val obj1 = NormalClass()
    val obj2 = NormalClass()
    println(obj1.toString())
    println(obj2.toString())

    // Here, only one object of SingletonClass1 will be created
    val obj3 = SingletonClass1
    val obj4 = SingletonClass1
    println(obj3.toString())
    println(obj4.toString())

    val obj5 = SingletonClass2
    println(obj5.name)
    println("Add 5 + 6: ${obj5.add(5,6)}")
}