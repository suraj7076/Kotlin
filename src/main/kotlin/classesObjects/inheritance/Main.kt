package classesObjects.inheritance

fun main(){
    val dog1 = Dogs(4, "White")
    dog1.eat()
    dog1.sleep()
    //here sound method is being overridden
    dog1.sound()

    val cat1 = Cats(4, "Golden")
    cat1.eat()
    cat1.sleep()
    //here sound method is being overridden
    cat1.sound()
}