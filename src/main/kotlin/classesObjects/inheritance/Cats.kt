package classesObjects.inheritance

class Cats(legs : Int, color : String) : Animals(legs, color) {
    override fun sound(){
        println("I purr")
    }
}