package com.kotlinplayground.basics

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 19-11-2023, Sunday
 **/

fun main() {
    val range = 1 .. 10

    for (i in range) {
        println("i : $i")
    }

    val downRange = 10 downTo 1

    for (j in downRange) {
        println("j : $j")
    }

    println("--------------------- while ---------------------------")

    exploreWhile()
}

fun exploreWhile() {
    var i = 1
    while (i<10) {
        println("Infinite Loop")
    }
}
