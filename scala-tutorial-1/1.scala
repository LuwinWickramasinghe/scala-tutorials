object A {
  def prime(n: Int, divisor : Int = 2): Unit = {
    
    if (n <= 1) {
      println("True")
    } else if (n == divisor) {
      println("True")
    } else if (n % divisor == 0) {
      println("False")
    } else {
      prime(n,divisor+1)
    }

  }

  def main(args: Array[String]): Unit = {
    prime(45)
  }
}
