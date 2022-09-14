package `interface`

class CallMe : MyInterface, NewInterface {
    override fun hello(){
        println("fun hello is called from CallMe class")
    }

    override fun greeting() {
        println("fun greeting is called from CallMe class")
    }

    override fun newFun() {
        println("Hey, Its fun")
    }
}