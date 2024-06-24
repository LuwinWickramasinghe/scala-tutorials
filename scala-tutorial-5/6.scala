object A {
  def fibonacci(n: Int): Int = {
    if (n <= 1) {
      n // Base case: return n when n is 0 or 1
    } else {
      fibonacci(n - 1) + fibonacci(n - 2) // Recursive call to calculate the Fibonacci sequence
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter value for n : ")
    var n = scala.io.StdIn.readInt()
    println(0)
    for(i <- 1 to n-1){
        val result = fibonacci(i)
        println(result)
    }
  }
}
