package recursion

import java.math.BigInteger

fun main() {
    val res = BigInteger.ONE
    val n = BigInteger("700000")
    println(fact(n, res))
}
tailrec fun sum(n: Long, result: Long = 0) : Long {
    return if (n <= 0) {
        result
    } else {
        sum( (n - 1), n+result)
    }
}

// This is more efficient for big number
tailrec fun fact(n : BigInteger, res: BigInteger): BigInteger{
    if (n == BigInteger.ONE)
        return res
    return fact(n - BigInteger.ONE, res * n)
}
tailrec fun fact(n: Int, res: Int = 1): Long {
    return if (n == 1){
        res.toLong()
    } else {
        fact(n-1, res*n)
    }
}