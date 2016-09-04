import java.math.BigInteger

fun factorial(n: Int): BigInteger {
    tailrec fun factorialHelper(n: BigInteger, acc: BigInteger): BigInteger {
        if (n == BigInteger.ZERO)
            return acc
        else
            return factorialHelper(n - BigInteger.ONE, acc * n)
    }

    return factorialHelper(BigInteger.valueOf(n.toLong()), BigInteger.ONE)
}

fun main(args: Array<String>) {
  print("Result = ${factorial(10000)}\n")
}
