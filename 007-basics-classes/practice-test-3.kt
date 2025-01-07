/*==========================
Test 3 :
============================

To test your code, you need a generator that can create random employees. 
Define a RandomEmployeeGenerator class with a fixed list of potential names 
(inside the class body). Configure the class with a minimum and maximum salary 
(inside the class header). In the class body, define the generateEmployee() function. 
Once again, the main function demonstrates how you can use this class.

In this exercise, you import a package so that you can use the Random.nextInt() function. 
For more information about importing packages, see Packages and imports.

----------------------
Hint 1
Lists have an extension function called .random() that returns a random item within a list.

----------------------

Hint 2
Random.nextInt(from = ..., until = ...) gives you a random Int number within specified limits.
*/

import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

// Write your code here

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}