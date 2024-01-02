package com.kotlinplayground.classes

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 25-11-2023, Saturday
 **/
object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("UserName : $userName and Password: $password")
    }
}

fun main() {
    Authenticate.authenticate("selvmut01","test@123$")
}