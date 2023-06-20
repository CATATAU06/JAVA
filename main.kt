fun main(args: Array<String>) {
  print("Insira o seu nome: ")
  var name = readLine()!!
  println("Seja bem-vindo(a) " + name)

  println()

  println("Agora insira dois números e veja o que acontece.")
  print("Número 1: ")
  var n1 = readLine()!!.toDouble()
  print("Número 2: ")
  var n2 = readLine()!!.toDouble()

  println()

  println("Soma: " + (n1 + n2).toInt())
  println("Subtração: " + (n1 - n2).toInt())
  println("Multiplicação: " + (n1 * n2).toInt())
  println("Divisão: " + (n1 / n2))
}