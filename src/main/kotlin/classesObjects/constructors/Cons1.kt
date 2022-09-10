package classesObjects.constructors

class Animal constructor(var name :String, var age : Int){

    fun eat(){
        println("$name eat food")
    }

    fun age(){
        println("$name's age is : $age ")
    }
}

fun main(){
    val animal = Animal("Human", 32)
    animal.eat()
    animal.age()

    val elephant = Animal("Elephant", 15)
    elephant.eat()
    elephant.age()
}