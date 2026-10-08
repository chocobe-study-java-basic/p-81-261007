package com.github.chocobe

fun main() {

//    val p = Person()
//    p.name = "John"
//    p.age = 20

    val p = Person().apply {
        age = 20
        name = "John"
        init()
    }

    p.greet()
}