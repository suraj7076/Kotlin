package companionObject

class FirstClass {
    fun oneFunction() {
        // it’s possible to use them inside the class without the class name
        println("$name and few things added.")
    }


    /*
    There are times we need to use a companion object to define class members that are going to be used independently of any instance of that class.
    The Kotlin compiler guarantees we will have one and only one instance of a companion object.
    For those of us with a background in Java and C#,
    a companion object is similar to static declarations.
     */

    // Note: we can have only one companion object per class.
    companion object {
        const val name = "This is a name val"
        fun message() {
            println("This is a hello message ...")
        }
    }
}


// Named Companion Object

/*
By default, a companion object’s name is Companion.
However, it is possible to rename it.
Let’s implement a Factory Method design pattern in its simplest form.
The Factory Method design pattern handles object creation.
We’ll implement this design pattern using a companion object.
 */
class SecondClass {
    companion object Demo {
        fun firstInstance() : SecondClass = SecondClass()
    }
}


// Inheritance and Companion Object

/*
A companion object is not inheritable.
But it can inherit from another class or implement interfaces.
This is one of the reasons that a companion object is similar to static declarations in Java and C#.

 */
interface TaskOperation {
    fun software(): String
}
abstract class SoftwareCreator {
    abstract fun make(): TaskOperation
}

class Engineer1: TaskOperation{
    companion object Software : SoftwareCreator() {
        override fun make() = Engineer1()
    }

    override fun software(): String = "This is from Engineer1"
}

class Engineer2: TaskOperation{
    companion object Software : SoftwareCreator() {
        override fun make() = Engineer2()
    }

    override fun software(): String = "This is from Engineer2"
}


/*
Java Interoperability

As we know, a companion object can inherit a class or interfaces — something that is not viable in Java static members.
So, if we need a Java-interoperable code, the solution is @JvmStatic functions and @JvmStatic properties. By annotating a companion object’s members with @JvmStatic,
we will gain better Java interoperability:
 */
class ThirdClass {
    companion object {
        @JvmStatic
        val detailName = "Few Details ..."
    }
}


/*
 Interfaces and Companion Object

A companion object can be used in interfaces as well.
We can define properties and concrete functions within a companion object enclosed in an interface.
One potential usage is storing constants and helper functions related to the interface:


 */

interface FirstInterface {
    companion object {
        const val element = "element ..."
    }
}
fun main() {
    val obj1 = FirstClass.message()

    val name = FirstClass.name
    println(name)

    val obj2 = FirstClass()
    obj2.oneFunction()



    val instance = SecondClass.Demo.firstInstance()

    val engineer1 = Engineer1.Software
    println(engineer1.make().software())

    val engineer2 = Engineer2.Software
    println(engineer2.make().software())

}