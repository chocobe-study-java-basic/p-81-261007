package com.github.chocobe

class Person(
    val name: String,
) {

    fun greet() {
        println("Hello, my name is $name")
    }
}

fun staticGreet() {
    println("Hello, staticGreeting")
}