def cal_interest(dep:Double)={
   val intRate: Double = dep match {
    case dep if dep <= 20000 => 0.02
    case dep if dep <= 200000 => 0.04
    case dep if dep <= 2000000 => 0.035
    case _ => 0.065
   }
   dep *intRate
}

def main(args: Array[String]):Unit={
   println("Enter deposit value: ")
    val deposit:Double = scala.io.StdIn.readDouble()
   // val deposit = 200000.0
    val interest = cal_interest(deposit)
    println(interest)
}
    


