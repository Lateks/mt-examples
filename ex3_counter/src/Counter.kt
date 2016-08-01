var incrementCounter: (() -> Unit)? = null
var getCounter: (() -> Int)? = null

fun initCounter(): Unit {
    var c = 0
    incrementCounter = { -> c = c + 1 }
    getCounter = { -> c }
}

fun main(args: Array<String>) {
    initCounter()
    println(getCounter!!())
    incrementCounter!!()
    println(getCounter!!())
    incrementCounter!!()
    incrementCounter!!()
    println(getCounter!!())
}
