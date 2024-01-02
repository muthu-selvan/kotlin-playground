package com.kotlinplayground.classes

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 20-11-2023, Monday
 **/
class Person {

    fun action() {
        println("Person Walks")
    }

    companion object {
        const val noOfCourse = 19
        fun getCountry(): String = "India"
    }
}

fun main() {
    val person: Person = Person()
    person.action()

    val country = Person.getCountry()
    println("country = $country")

    val noOfCourse = Person.noOfCourse
}