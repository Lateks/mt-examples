object MutualRecursion {
    def main(args: Array[String]): Unit = {
        println(isOdd(10))
        println(isEven(10))
        println(isOdd(9))
        println(isEven(9))
        println(isOdd(2147483647))
    }

    def isOdd(n: Int): Boolean = {
        if (n == 0)
            return false
        return isEven(n - 1)
    }

    def isEven(n: Int): Boolean = {
        if (n == 0)
            return true
        return isOdd(n - 1)
    }
}
