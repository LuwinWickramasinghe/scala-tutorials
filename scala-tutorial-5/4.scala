object A {
  def Number(n: Int): Unit = {
    if (n == 0) {
      println("Even")
    } else if (n == 1) {
      println("Odd")
    } else {
      Number(n - 2)
    }
  }

  def main(args: Array[String]): Unit = {
    Number(20)
  }
}
