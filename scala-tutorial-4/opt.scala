object changeNamesettings{
    def toUpper(in:String):String = {
        in.toUpperCase
    }

    def toLower(in:String):String = {
        in.toLowerCase
    }

    def changeNamesettings.formatNames(name: String)(funcFormat: String => String): String = {
        funcFormat(name)
    }

}

def main(args: Array[String]): Unit = {

    println(changeNamesettings.formatNames("Benny", toUpper))
    println(changeNamesettings.formatNames("Ni", toUpper)+"roshan")
    println(changeNamesettings.formatNames("Saman", toLower))
    println("Kumar"+changeNamesettings.formatNames("a", toUpper))
}