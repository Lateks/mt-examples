fun add(x: Int): (Int) -> Int {
    return { y -> x + y }
}

fun main(args: Array<String>) {
    println(add(5)(4))

    val add10 = add(10)

    println(add10(90))
    println(add10(999))
}
