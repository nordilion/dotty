object Test {

  def main(args: Array[String]): Unit = {
    fun(foo)
  }

  def foo: Int = {
    println("foo")
    42
  }

  def fun[T](unused x: T): Unit = {
    println("fun")
  }
}
