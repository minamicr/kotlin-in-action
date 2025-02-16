package org.javagirls.capitulo_2

fun main() {
    println("KOTLIN --------------------------")
    println("Hello world !")
    println("Máximo entre 4 e 40 é " + maxWithBlockBody(4, 40))
    println("Máximo entre 1 e 2 é " + maxExpressionBody(1, 2))
    println("Máximo entre 10 e 20 é " + maxExpressionBodySimpler(10, 20))
}

// Função com block body (código entre chaves), obrigatória cláusula return
fun maxWithBlockBody(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Função com expression body (sem chaves)
fun maxExpressionBody(a: Int, b: Int): Int = if (a > b) a else b

// Omitir tipo de retorno é permitido apenas em funções com expression body
fun maxExpressionBodySimpler(a: Int, b: Int) = if (a > b) a else b
