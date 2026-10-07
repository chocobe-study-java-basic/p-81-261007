package com.github.chocobe

fun main() {

    val ageMap = mapOf(
        "Peter" to 24,
        "Clark" to 30,
        "Bruce" to 40
    )

    for ((key, value) in ageMap) {
        println("$key: $value")
    }


    val mutableAgeMap = mutableMapOf(
        "Peter" to 24,
        "Clark" to 30,
        "Bruce" to 40
    )
    mutableAgeMap["Peter"] = 42

    for (entry in mutableAgeMap) {
        println("$entry")
    }
}