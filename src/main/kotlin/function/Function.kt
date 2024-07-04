package com.surajmyt.function

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()

    for (t in ts) {
        result.add(t)
    }

    return result
}

fun main() {
    val list = asList(1,2,3)
    println(list)
}