package classesObjects.inheritance

class Dogs(legs : Int, color : String) : Animals(legs, color) {
    override fun sound() {
        println("I bark")
    }
}