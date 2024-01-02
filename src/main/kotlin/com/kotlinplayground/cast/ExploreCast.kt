package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course
import java.util.*

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 26-11-2023, Sunday
 **/

fun checkType(type: Any) {

    when(type) {
        is Course -> {
            println(type.copy())
        }

        is String -> {
            println(type.lowercase(Locale.getDefault()))
        }
    }
}

fun main() {
    val course = Course(1,"Kotlin Master Class","Muthu Selvan")

    checkType(course)
}

