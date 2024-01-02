package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 25-11-2023, Saturday
 **/

interface CourseRepository {
    val courseDuration: Double
    fun getCourseById(id: Int): Course
}

class JavaCourseRepository : CourseRepository {
    override val courseDuration: Double
        get() = 7.25

    override fun getCourseById(id: Int): Course {
        return Course(1,"Java 17 OCJP 1Z0-829","Tim")
    }
}

class CassandraCourseRepository : CourseRepository {
    override val courseDuration: Double
        get() = 123.5

    override fun getCourseById(id: Int): Course {
        return Course(2,"Cassandra for Beginners","Tim")
    }
}