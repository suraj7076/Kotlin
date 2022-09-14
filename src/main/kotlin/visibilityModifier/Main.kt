package visibilityModifier

fun main(){
    var sum = sum(1,2)

    // note: we can't call it because it is declared as private
    //var sub = difference(3,4)

    var division = division(5,2)


}

class Product{
    protected fun product(a: Int, b : Int) = a*b
}