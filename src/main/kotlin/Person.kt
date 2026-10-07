package com.github.chocobe

data class Person(
    val name: String,
) {
    fun greet() {
        println("Hello, my name is $name")
    }
}
