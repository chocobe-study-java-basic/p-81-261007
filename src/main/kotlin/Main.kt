package com.github.chocobe

fun main() {

    val obj: Any = "Hello, World!"

    if (obj is String) {
        println(obj.length)
    }
}