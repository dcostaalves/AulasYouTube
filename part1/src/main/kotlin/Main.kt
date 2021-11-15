fun sum(x: Double, y: Double):Double{
    val res = x + y
    return res

}



fun main(args: Array<String>) {

    var mensagem: String? =""
    println("Digite um texto")
    mensagem = readLine()!!



    var contarCaracter = mensagem.length ?: 0 // para contar caracteres

    print(contarCaracter)

    var coord = Triple(5,6,3)
    val (x,y,z) = coord

    println("${x} ${y} ${z}")






/*
   // println("Digite a idade: ")
    val num1 = 15
    val num2 = 20

    println(sum(num1.toDouble(),num2.toDouble()))
*/
/*
    val age = 0
    println("Digite sua idade")
    age == readLine()!!.toInt()
    when (age){
        in 0..12 -> println("Criança")
        in 13..17 -> println("Adolescente")
        in 18..29 -> println("Jovem")
        in 29..59 -> println("Adulto")
        in 60..100 -> println("Idoso")
    }
*/

}