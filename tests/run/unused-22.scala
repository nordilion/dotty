
object Test {

  def main(args: Array[String]): Unit = {
    val a: Int = fun1
    ()
  }

  implicit def foo: Int = {
    println("foo")
    42
  }
  def fun1(implicit unused boo: Int): Int = {
    println("fun1")
    43
  }
}
