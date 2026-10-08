package com.github.chocobe

fun main() {

    val p1 = Person()

    val result = p1.run {
        name = "John"
        age = 20

        init()
        greet()
        getPersonNumber()
    }

    println("result = $result")
}