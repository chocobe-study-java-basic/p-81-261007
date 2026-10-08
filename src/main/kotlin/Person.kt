package com.github.chocobe

class Person {

    var age: Int = 0
    var name: String = ""

    fun greet() {
        println("Hello, my name is $name, and I amd $age years old")
    }

    fun init() {
        println("$name 객체를 초기화 하였습니다.")
    }

    fun getPersonNumber(): Int {
        return 1234
    }
}