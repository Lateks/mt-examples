fun double(x: Int): Int {
    return 2 * x
}

// This is needed because otherwise Kotlin optimizes
// the first class function away by inlining the
// map function.
fun getDouble(): (Int) -> Int {
    return ::double
}

fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4, 5).map(getDouble()))
}

