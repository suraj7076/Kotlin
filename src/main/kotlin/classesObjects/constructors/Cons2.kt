package classesObjects.constructors

//Note: below this 'Car' class has only secondary constructor and no primary constructor
class Car{
    var model : String
    var color : String
    var speed : Int

    constructor(model : String, color : String, speed: Int){
        this.model = model
        this.color = color
        this.speed = speed
    }
}


//Note: this 'Door' class has both primary constructor and secondary constructor
class Door(brand : String, color : String, height : Int){
    var wood : String? = null

    constructor(brand : String, color : String, height : Int, wood : String):this(brand, color, height){
        this.wood = wood
    }
}

fun main(){
    val door1 = Door("A","Blue", 3)

    val door2 = Door("B","White", 32, "Sal")

}