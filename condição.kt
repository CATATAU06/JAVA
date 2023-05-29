fun main() {
  print("Qual seu idade: " )
  val idade= readLine() !!
    println("Sua idade é " +idade)
//numeros digitados no tecladdo são interpretados como texto
//string
    //convertendo string para Int
    val num = idade.toInt()


    if (num >=18) {
      println("você é maior de idade")
} else {
    println("você é menor de idade")
}


 }
