object CaesarCipher {
  def encrypt(text: String, shifter: Int): String = {
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


  def decrypt(text: String, shifter:Int) : String ={
    encrypt(text, -shifter)
  }

  def Cipher(text: String , proFunction:(String, Int) => String , shifter:Int): String ={
    proFunction(text,shifter)
  }

  def main(args: Array[String]): Unit = {

    println("Enter a word: ")
    val word = scala.io.StdIn.readLine

    println("Enter a shifter value (To decrypt enter a minus value of the shifter")
    val shifter = scala.io.StdIn.readInt
    
    val encryptedText = Cipher(word, encrypt, shifter)
    val decryptedText = Cipher(encryptedText, decrypt, shifter)

    println("Encrypted Text: " + encryptedText)
    println("Decrypted Text: " + decryptedText)
  }
}
