package com.github.chocobe

fun main() {
    val dog = Dog()
    dog.makeSound()
}

open class Animal {
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        super.makeSound()
        println("- bark! bark!")
    }
}
