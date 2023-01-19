package extension_inline_Fun

private val privateVar = "I'm private"

@PublishedApi
internal val internalVar = "I'm internal"

val publicVar = "I'm public"

inline fun higherOrderFunction(aLambda: () -> Unit) {

    //ERROR: can't access this variable in an inline function.
    //privateVar.length

    //Can access this variable because it's marked with @PublishedApi and internal
    println(internalVar.length)

    //Can access this variable, it's public
    println(publicVar.length)

}

fun main(){
    higherOrderFunction { {} }
}