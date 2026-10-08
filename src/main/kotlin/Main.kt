package com.github.chocobe

fun main() {

    val name: String? = "Hello"

    println(name?.length)

    val result = name?.let {
        // logic...
        println(it)
        it.length
    }

    println("result: $result")
}