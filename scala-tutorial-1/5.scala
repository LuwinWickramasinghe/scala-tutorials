object A {
  def iseven(n: Int): Boolean = {
    if (n == 0) {
      true
    } else if (n == 1) {
      false
    } else {
      iseven(n - 2)
    }
  }
  def evenadd(x : Int): Int = {
    if(x>=1){
        evenadd(x - 1) + (if (iseven(x)) x else 0)
    }
    else(
        0
    )
  }
  def main(args: Array[String]): Unit = {
    val z = evenadd(8)
    println(z)
  }
}
