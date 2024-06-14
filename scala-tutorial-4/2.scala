def numbercheck(number:Int)={
    number match{
        case n if n%2 == 0 => println("Even")
        case n if n%2 == 1 => println("Odd")
        case _ => println("Negative/Zero")
    }
}

def main(args: Array[String]):Unit={
    println("Enter integer")
    val InNumber:Int = scala.io.StdIn.readInt()
    numbercheck(InNumber)
}