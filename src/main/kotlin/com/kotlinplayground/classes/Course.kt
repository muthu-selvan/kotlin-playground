package com.kotlinplayground.classes

/**
 * Baker Hughes
 *
 * @author : Muthu Selvan
 * @created : 25-11-2023, Saturday
 **/
data class Course(
    val id: Int,
    val courseName: String,
    val authorName: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1,"Kotlin Master Class","Muthu Selvan")
}
