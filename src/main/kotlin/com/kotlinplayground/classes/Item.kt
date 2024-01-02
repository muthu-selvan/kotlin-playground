package com.kotlinplayground.classes

import java.lang.IllegalArgumentException

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 25-11-2023, Saturday
 **/
class Item {
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }

    var rate: Double = 0.0
        get() {
            return field
        }
        set(value) {
            if(value < 0.0) {
                throw IllegalArgumentException("Price cannot be below 0.0")
            }

            field = value
        }
}