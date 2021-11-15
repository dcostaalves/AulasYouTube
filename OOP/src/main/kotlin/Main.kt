import java.util.*


//CLASSE DE DADOS - ARMAZENAM DADOS

data class PersonDados(val name: String, val lastName: String)

fun main(args: Array<String>){

    val student = PersonDados("Camila", "Mayara")
    println(student)

}

//HERANÇAS
                /*
open class PersonHeranca (var firstName: String){
    init {
        println(this.firstName)
    }
}

open class Student(name: String): PersonHeranca(name){
    init {
        this.firstName = name.uppercase(Locale.getDefault())
        println("O nome do aluno ${this.firstName}")
    }
}

open  class MemberGroup (name: String): Student(name){
    open var time = 2

}

class Player(name: String): MemberGroup(name){
    override var time: Int
        get() = super.time * 2 //ao usar super eu pego as propriedades da superClass e posso manipular a mesma
        set(value) {}
}

fun main(args: Array<String>){

    var aluno1 = Student("Ronaldo")

    val person = MemberGroup("João")
    println(person.time)
    println(person.firstName)

}
            */

           /*
//CONSTRUTORES + INIT
//INIT - faz com que obrigatoriamente uma função seja instanciada ao ser executada uma classe

class PersonNew(var firstName: String, var lastName: String?){
    var age: Int = 0
    var fullName: String

   constructor(firstName: String, lastName: String, age: Int ):
           this(firstName, lastName){
                this.age = age
           }

    init {
        fullName = "$firstName $lastName"
    }
    init {
        println(fullName)
    }

}

fun main(args: Array<String>){

    var usuario1 = PersonNew("Danilo","Alves")
    var usuario2 = PersonNew("Matheus", "Neném")



}

            */

/* CLASSES
class Person(){

    var firstName = ""
    var lastName = ""
}


fun main(args: Array<String>) {

    val pessoa1 = Person()
    val pessoa2 = Person()

    pessoa1.firstName = "Claudio"
    pessoa1.lastName = "da Silva"

    pessoa2.firstName = "Ronaldo"
    pessoa2.lastName = "Souza"

    println("Olá Sr° ${pessoa1.firstName} ${pessoa1.lastName}; \nOlá " +
            "Sr° ${pessoa2.firstName} ${pessoa2.lastName};" +
            "\nCadastro realizado!"  )
}
            */