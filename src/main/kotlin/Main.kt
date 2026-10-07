package com.github.chocobe

fun main() {

    val day = 3

    val result = when(day) {
        1 -> "Monday"
        2 -> {
            "Tuesday"
        }
        3 -> "Wednesday"
        else -> "All"
    }

    println("result: $result")
}
