package com.kotlinplayground.basics

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 20-11-2023, Monday
 **/
fun getRandomIntValue(): Int = (0..1000).random()


fun main() {
    val randomNum = getRandomIntValue()
    println("Random Num: $randomNum")
}