object Test {
  def main(args: Array[String]): Unit = {
    val ds: Dataset = new Dataset
    println(ds.select(true).toString)
  }
}

class Dataset {
  def select[A](unused c: Boolean): String = "abc"
}
