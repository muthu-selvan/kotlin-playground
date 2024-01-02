package com.kotlinplayground.basics


/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 20-11-2023, Monday
 **/

fun printName(name: String) {
    println("Name is : $name")
}

fun add(x: Int, y: Int): Int {
    return x+y
}

fun main() {
    printName("Muthu Selvan")

    val sum = add(5,3)
}




