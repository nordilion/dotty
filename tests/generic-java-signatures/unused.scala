object MyUnused {
  def f1[U](unused a: Int): Int = 0
}

object Test {
  def main(args: Array[String]): Unit = {
    val f1 = MyUnused.getClass.getMethods.find(_.getName.endsWith("f1")).get
    val tParams = f1.getTypeParameters
    println(f1.toGenericString)
    tParams.foreach { tp =>
      println(tp.getName + " <: " + tp.getBounds.map(_.getTypeName).mkString(", "))
    }
  }
}
