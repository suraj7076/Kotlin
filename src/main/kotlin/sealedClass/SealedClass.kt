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

// A sealed class with a string property
sealed class Vehicle (val item: String) {
    //// Two subclasses of sealed class
    class Audi : Vehicle("AUDI")
    class Bmw : Vehicle("BMW")


    // we can also declare data class, object declaration, sealed class and interface inside Sealed Class
    data class Suzuki(val model: String): Vehicle("Suzuki")
    object ObjClass: Vehicle("OBJ")
    sealed interface Run

}

// A subclass defined outside the sealed class
class LandRover: Vehicle("LandRover")
fun callName(vehicle: Vehicle) {
    when (vehicle) {
        is Vehicle.Audi -> println("This is ${vehicle.item}")
        is Vehicle.Bmw -> println("This is ${vehicle.item}")
        is LandRover -> println("This is ${vehicle.item}")
        is Vehicle.Suzuki -> println("This is ${vehicle.item}")
        Vehicle.ObjClass -> println("No Car Found")
        else -> println("Nothing ...")
    }
}
fun main() {
    val obj1 = Demo.FirstClass()
    obj1.greet()

    val obj2 = Demo.SecondClass()
    obj2.greet()

    val vehicle1 = Vehicle.Audi()
    val vehicle2 = Vehicle.Bmw()
    val vehicle3 = LandRover()
    val suzuki = Vehicle.Suzuki("A10")
    val obj = Vehicle.ObjClass

    callName(vehicle1)
    callName(vehicle2)
    callName(vehicle3)
    callName(suzuki)
    callName(obj)
}