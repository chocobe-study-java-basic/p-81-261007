package com.github.chocobe

import Person1

fun main() {

    val names = listOf("Alice", "Bob", "Charlie")

    println("람다 기본형: ")
    names.forEach({ name -> println(name) })

    println("\n람다를 파라미터 밖으로 옮기기: ")
    names.forEach() { name -> println(name) }

    println("\n인자가 1개인 람다는 \"함수명(It)\"으로 축약 가능: ")
    names.forEach { println(it) }
}
