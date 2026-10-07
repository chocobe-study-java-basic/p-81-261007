package com.github.chocobe

import Person1

fun main() {

    val person1 = Person1("John")
    val person2 = Person1("John")
    println(person1 == person2)

    val person3 = Person("Chocobe")
    val person4 = Person("Chocobe")
    println(person3 == person4)
}
