package com.kotlinplayground.basics

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 30-12-2023, Saturday
 **/

fun main() {
    println(sytemInfo())
}

fun sytemInfo(): String = when(val numberOfCores = Runtime.getRuntime().availableProcessors()) {
    1 -> "1 core, packing this one "
    else -> "$numberOfCores cores!"
}
