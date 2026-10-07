package com.github.chocobe

fun main() {

    val names = listOf("Alice", "Bob", "Charlie")
    for (name in names) {
        println("Hello $name")
    }

    val mutableNames = mutableListOf("Alice", "Bob", "Charlie")
    mutableNames.add("Chocobe")
    for (name in mutableNames) {
        println("Hello $name")
    }
}