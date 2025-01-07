/*==========================
Test 2 :
============================

You have a function that translates a time interval given in hours, minutes, and seconds into seconds. 
In most cases, you need to pass only one or two function parameters while the rest are equal to 0.
 Improve the function and the code that calls it by using default parameter values and named arguments 
 so that the code is easier to read.
----------------------
*/

fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))
}