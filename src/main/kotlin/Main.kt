package com.github.chocobe

fun main() {
    val person1 = Person("Chocobe")
    println("person1.getName() = ${person1.getName()}")
}

class Person(
    private val name: String,
) {
    fun getName(): String {
        return name
    }
}
