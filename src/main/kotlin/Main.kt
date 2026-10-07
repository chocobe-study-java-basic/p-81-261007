package com.github.chocobe

import Person1

fun main() {

    val name: String = "Alice"

    println(name.length)
    println(name.uppercase())
    println(name.lowercase())

    name.greet()

    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.square())
}

fun String.greet() {
    println("Hello, $this")
}

fun List<Int>.square(): List<Int> {
    val result = this.map({ value -> value * value })
    return result
}
