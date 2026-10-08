package com.github.chocobe

fun main() {
    println("lazyValue = $lazyValue")
    println("lazyValue = $lazyValue")
}

val lazyValue: String by lazy {
    println("Computed!")
    "Hello"
}
