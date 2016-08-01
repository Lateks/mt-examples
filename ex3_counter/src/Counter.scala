object Counter {
  var incrementCounter: () => Unit = null
  var getCounter: () => Int = null

  def main(args: Array[String]): Unit = {
      initCounter()
      println(getCounter())
      incrementCounter()
      println(getCounter())
      incrementCounter()
      incrementCounter()
      println(getCounter())
  }

  def initCounter(): Unit = {
      var c = 0
      incrementCounter = () => c = c + 1
      getCounter = () => c
  }
}
