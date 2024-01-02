package com.kotlinplayground.basics

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 19-11-2023, Sunday
 **/

fun main() {
    val position: Int = 1

    val medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    println(medal)
}