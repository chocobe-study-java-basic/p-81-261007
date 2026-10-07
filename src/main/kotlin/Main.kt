package com.github.chocobe

fun main() {
    sayHello(age = 10)
    sayHello("Chocobe", 20)
    sayHello(age = 30, name = "Miles")
}

fun sayHello(name: String = "Guest", age: Int) {
    println("Hello, $name")
}
