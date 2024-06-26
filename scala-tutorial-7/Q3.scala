object Q3 {

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else {
      val sqrtN = math.sqrt(n).toInt
      (2 to sqrtN).forall(i => n % i != 0)
    }
  }

  def filterPrime(li: List[Int]): List[Int] = {
    li.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val primeNumbers = filterPrime(num)

    println("Prime Numbers: " + primeNumbers)
  }
}
