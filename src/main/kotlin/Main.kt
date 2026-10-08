package com.github.chocobe

fun main() {
    println("MyUtils.MY_PI = ${MyUtils.MY_PI}")

    MyUtils.greeting()
    MyUtils.greeting("Chocobe")
}

class MyUtils {
    companion object {
        val MY_PI = 3.14

        fun greeting(name: String? = null) {
            println("Hello ${name ?: "World"}!")
        }
    }
}