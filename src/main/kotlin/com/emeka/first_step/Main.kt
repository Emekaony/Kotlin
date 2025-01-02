package main.kotlin.com.emeka.first_step

import java.io.File

fun main( ) {
    // open a file and read the contents of the file
    val filename: String = "src/resources/dummy.txt"
    val file = File(filename)
    val lines = file.readLines().forEach { println(it) }
}