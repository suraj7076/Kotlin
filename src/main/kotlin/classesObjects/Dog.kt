package classesObjects

class Dog{
    var breed : String = "Lab"
    var color : String = "Black"
    var age : Int = 3

    fun eat(){
        println("${breed}s eat food")
    }
    fun bark(){
        println("${breed}s bark")
    }
}

fun main(){
    var dog = Dog()

    dog.bark()
    dog.eat()
}