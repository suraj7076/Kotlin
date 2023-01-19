package extension_inline_Fun

// INLINE FUNCTION
inline fun inlineFunction(myFun:() -> Unit){
    myFun()
    println("This is the line inside inlineFunction()")
}

//  NON LOCAL CONTROL FLOW
inline fun inlineFunction(myFun: () -> Unit, nextFun: () -> Unit){
    myFun()
    nextFun()

    println("Code inside Inline Function")
}

//  CROSS LINE ANNOTATION
inline fun inlineFunctionCrossLine(crossinline myFun: () -> Unit, nextFun: () -> Unit){
    myFun()
    nextFun()

    println("Code inside Inline Function")
}


//  NO INLINE MODIFIER
inline fun inlineFunctionNoLine(myFun: () -> Unit,
                                noinline nextFun: () -> Unit){
    myFun()
    nextFun()

    println("Code inside Inline Function")
}


fun main(){

    // INLINE FUNCTION
    //  inlineFunction { println("inlineFunction() is called from main function") }


    //  NON LOCAL CONTROL FLOW
    /*
    inlineFunction(
        {
            println("First Function")
        },
        {
            println("Next Function")
        }
    )


     */


    /*
     CROSS LINE ANNOTATION
    inlineFunctionCrossLine(
        {
            println("Hello")
            // to prevent return from lambda expression and
            // inline function itself, we use crossline

            //return    this will throw an error
        },
        {
            print("By")
        }
    )


     */





    //  NO INLINE MODIFIER
    inlineFunctionNoLine(
        {
            println("My function ")

        },
        {
            println("Next Function")
        }
    )

}
