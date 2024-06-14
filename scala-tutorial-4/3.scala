object changeNamesettings {
  def toUpper(in: String): String = {
    in.toUpperCase
  }

  def toLower(in: String): String = {
    in.toLowerCase
  }

  def formatNames(name: String)(funcFormat: String => String): String = {
    funcFormat(name)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    import changeNamesettings._

    println(formatNames("Benny")(toUpper))
    println(formatNames("Ni")(toUpper) + "roshan")
    println(formatNames("Saman")(toLower))
    println("Kumar" + formatNames("a")(toUpper))
  }
}
