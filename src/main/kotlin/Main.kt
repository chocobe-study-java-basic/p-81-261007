package com.github.chocobe

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val result = numbers.filter { it % 2 == 0 }

    result.forEach { println(it) }
    result.forEach(::println)
}
