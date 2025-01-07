/*==========================
Test 1 :
============================

Define a data class Employee with two properties: 
one for a name, and another for a salary. 
Make sure that the property for salary is mutable, 
otherwise you won’t get a salary boost at the end of the year! 
The main function demonstrates how you can use this data class.
----------------------
*/

// Write your code here

fun main() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}