// Compile with `scalac Factorial.scala`.
// Run with `scala Factorial`.
object Factorial {
    def main(args: Array[String]): Unit = {
      val res = fact(10000)
      println(res)
    }

    def fact(n: Int): BigInt = {
      def fact_helper(n: Int, acc: BigInt): BigInt = {
        if (n == 0) acc
        else fact_helper(n - 1, acc * n)
      }
      fact_helper(n, BigInt(1))
    }
}
