object SimpleClosure {
    def main(args: Array[String]): Unit = {
        println(add(5)(4))

        val add10 = add(10)
        println(add10(90))
        println(add10(999))
    }

    def add(x: Int): Int => Int = {
        (y: Int) => x + y
    }
}
