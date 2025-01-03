/*==========================
Test 1 :
============================

Write a function called circleArea that takes the radius of a circle 
in integer format as a parameter and outputs the area of that circle.
----------------------

import kotlin.math.PI

// Write your code here

fun main() {
    println(circleArea(2))
}

*/

import kotlin.math.PI

// Write your code here

fun circleArea(radius: Int): Double = PI * (radius * radius)

//OR

// fun circleArea(radius: Int): Double {
//     return PI * radius * radius
// }

fun main() {
    println(circleArea(2))
}