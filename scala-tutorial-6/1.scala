object CaesarCipher {
  def caesarCipher(text: String, shifter: Int): String = {
    text.map { char =>

      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shiftedChar = ((char - base + shifter) % 26 + base).toChar
        shiftedChar
      } else {
        char
      }
    }
  }

  def main(args: Array[String]): Unit = {

    println("Enter a word: ")
    val word = scala.io.StdIn.readLine

    println("Enter a shifter value")
    val shifter = scala.io.StdIn.readInt
    
    val ciphertext = caesarCipher(word, shifter)
    println("Ciphertext: " + ciphertext)
  }
}
