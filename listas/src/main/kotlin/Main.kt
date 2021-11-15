fun main(args: Array<String>) {

        //Coleções em Kotlin

    //ARRAY

    val nums = arrayOf(1,2,3,4)
        /*
    println(nums.size) // mostra número de dados na lista
    println(nums.isEmpty()) //diz se a lista está vazia
    println(nums.first()) //mostra o primeiro dado da lista
    println(nums [1]) //mostra o valor guardado nesta posição
    println(nums.sliceArray(0..2).size) //Faz um RANGE
    println(nums.contains(4)) // ele diz se o valor procurado ja existe na lista
    println(nums.indexOf(2) // ele mostra em qual posição está este valor informado

    nums[0]= 10 // altero o valor da posição 0
    println(nums[0]) // imprimo o valor desta posição

    val drop = nums.drop(1) // drop remove o elemento descrito
    print(drop)

         */

    //LISTA ARRAY
        /*
    val l = arrayListOf<Int>(1,2,3,4)
    l.add(5) // adiciona este elemento
    println(l)

    l.remove(1) // remove da lista o elemento informado
    println(l)

    l.addAll(arrayListOf(10,11,12))// adiciono uma nova lista dentro da anterior
    println(l)

    l.set(0, 300) // nesta funçao ele substitui o elemento 'posição 0' por '300' = l[0] = 300
    println(l)

    l.clear() //apaga todos elementos da lista
    println(l)
            */
    //LIST
        /*
    val n = mutableListOf("a","b")
    println(n)

    n.remove("b")
    println(n)
        */
    //MAPAS - são listas que possuem chaves

    val map = mutableMapOf("A" to 2, "B" to 3, "C" to 30) // aqui eu digo qual a chave destinada p/ cada letra
    println(map)
    println(map.count())//mostra qtde de dados
    println(map.isEmpty()) // diz se esta vazia
    map.remove("A")
    println(map)

    //para percorrer um mapa

    for((key, value) in map){
        println("Key: $key, Value: $value")

    }

}