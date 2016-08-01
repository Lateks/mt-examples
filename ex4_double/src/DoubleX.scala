object DoubleX {
    def main(args: Array[String]): Unit = {
        println(List(1, 2, 3, 4, 5).map(doubleX))
    }

    def doubleX(x: Int): Int = {
        2 * x
    }
}
