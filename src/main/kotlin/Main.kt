package com.github.chocobe

import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption

fun main() {

    val result = try {
        Files.copy(
            File("a.txt").toPath(),
            File("a_copy.txt").toPath(),
            StandardCopyOption.REPLACE_EXISTING)
        true
    } catch(e: Exception) {
        e.printStackTrace()
        false
    }

    println("파일 복사: $result")
}
