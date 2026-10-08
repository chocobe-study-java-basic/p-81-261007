package com.github.chocobe

fun main() {
    val person1 = Person("Chocobe")

//    person1.name = "John"
//    println("person1.name = ${person1.name}")

    person1.name = "Miles"
    println("person1.name2 = ${person1.name}")
}

class Person(
    private var _name: String,
) {
    var name: String
        set(value) {
            _name = value
        }
        get() {
            return _name
        }
}
