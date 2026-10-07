package com.github.chocobe

fun main() {
    val result = sum(1, 2)
    println("result: $result")
}

fun sum(lhs: Int, rhs: Int): Int {
    return lhs + rhs
}