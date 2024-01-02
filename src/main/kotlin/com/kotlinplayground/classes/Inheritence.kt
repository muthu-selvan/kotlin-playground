package com.kotlinplayground.classes

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 25-11-2023, Saturday
 **/

open class User(val name: String) {
    open fun login() {
        println("Login By User")
    }
}

class Student(name: String) : User(name) {
    override fun login() {
        println("Login By Student")
    }
}

class Instructor(name: String) : User(name) {
    override fun login() {
        println("Login By Instructor")
    }
}

fun main() {
    val student = Student("Alex")
    println("Student Name: ${student.name}")
    student.login()

    val instructor = Instructor("Muthu Selvan")
    println("Instructor Name : ${instructor.name}")
    instructor.login()
}