package com.github.chocobe

fun main() {
    val s1 = Singleton
    val s2 = Singleton
    println(s1)
    println(s2)
    println(s1 == s2)

    val t1 = NotSingleton()
    val t2 = NotSingleton()
    println(t1)
    println(t2)
    println(t1 == t2)
}

object Singleton {
}

class NotSingleton {
}
