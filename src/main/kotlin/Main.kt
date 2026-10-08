package com.github.chocobe

fun main() {

    val names = listOf("Alice", "Bob", "Charlie")

    names
        .map { "Hello, $it" }
        .forEach(::println)
}
