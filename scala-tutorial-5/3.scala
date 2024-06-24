object A {
  def Number(n: Int): Int = {
    if(n>=1){
        n + Number(n - 1)
    }
    else{
        0
    }
  }

  def main(args: Array[String]): Unit = {
    var x =  Number(5)
    println(x)
  }
}
