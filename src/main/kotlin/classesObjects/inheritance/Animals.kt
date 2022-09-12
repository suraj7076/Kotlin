package classesObjects.inheritance

open class Animals(var legs : Int, var color : String) {
    fun eat(){
        println("I eat food")
    }
    fun sleep(){
        println("I sleep")
    }
    open fun sound(){
        println("I make a sound")
    }
}