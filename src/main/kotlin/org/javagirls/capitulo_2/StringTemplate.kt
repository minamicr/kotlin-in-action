package org.javagirls.capitulo_2

fun main() {
    println("KOTLIN --------------------------")
    val input = readln()
    val name = if (input.isNotBlank()) input else "Kotlin"

    println("Hello, $name!")

    // complex expression dentro de um string template, utilizar chaves
    println("Hello, ${name.length} letter person!")

    // utilizar barra invertida para imprimir $
    println("\$ utilizar barra invertida para imprimir $")

    // complex expression utilizando chaves ( pode conter aspas )
    println("Hello, ${if (name.isBlank()) "someone" else name }!")

}