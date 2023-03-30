package sealedClass

sealed class Demo {
    class FirstClass : Demo() {
        fun greet() {
            println("Hi from FirstClass")
        }
    }

    class SecondClass : Demo() {

        fun greet() {
            println("Hi from SecondClass")
        }
    }
}

fun main() {
    val obj1 = Demo.FirstClass()
    obj1.greet()

    val obj2 = Demo.SecondClass()
    obj2.greet()
}