package com.github.chocobe

fun main() {
    val dog1 = Dog()
    dog1.eat()
    dog1.play()
}

open class Animal {
    open fun eat() {
        println("Animal is eating!")
    }
}

interface Pet {
    fun play() {
        println("(default fun) Pet is playing...")
    }
}

class Dog : Animal(), Pet {
    override fun play() {
        println("Dog is playing!")
    }
}