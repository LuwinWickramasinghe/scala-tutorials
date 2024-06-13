object A {
  def prime(n: Int, divisor : Int = 2): Boolean = {
    
    if (n <= 1) {
      true
    } else if (n == divisor) {
      true
    } else if (n % divisor == 0) {
      false
    } else {
      prime(n,divisor+1)
    }

  }

  def primeseq(x:Int):Unit= {
        if(x <= 2){
            println(1);
        }
        else{
            primeseq(x-1)
            if(prime(x)){
                println(x);
            }

        }
    }
  def main(args: Array[String]): Unit = {
    primeseq(100)
  }
}
