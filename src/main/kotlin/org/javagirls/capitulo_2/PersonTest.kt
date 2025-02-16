package org.javagirls.capitulo_2

import org.javagirls.capitulo_2.Person

fun main() {
    println("KOTLIN --------------------------")
    val person = Person("Bob", true)
    println(person.name)
    println(person.isStudent)
    person.isStudent = false
    println(person.isStudent)
}