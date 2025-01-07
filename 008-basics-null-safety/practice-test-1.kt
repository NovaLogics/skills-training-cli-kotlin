/*==========================
Test 1 :
============================

You have the employeeById function that gives you access to a database of employees of a company. 
Unfortunately, this function returns a value of the Employee? type, so the result can be null. 
Your goal is to write a function that returns the salary of an employee when their id is provided, 
or 0 if the employee is missing from the database.
----------------------
*/

data class Employee (val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = // Write your code here

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })
}