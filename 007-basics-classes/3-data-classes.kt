/* Data Classes in Kotlin
> Purpose: 
    Data classes are useful for storing data and come with built-in functions for common tasks like 
    printing, comparing, and copying instances.

> Declaring a Data Class
    To declare a data class, use the data keyword

    data class User(val name: String, val id: Int)

> Predefined Functions in Data Classes
    * toString(): Prints a readable string of the class instance and its properties.
    * equals() or ==: Compares two instances for equality.
    * copy(): Creates a copy of an instance, optionally with modified properties.
*/

data class User(val name: String, val id: Int)


fun main(){
    println("\n~~~~~~~~~~~~~ SECTION 1 : Print as String ~~~~~~~~~~~~~\n")
    printAsString()

    println("\n~~~~~~~~~~~~~ SECTION 2 : Compare Instances ~~~~~~~~~~~~~\n")
    compareInstances()

    println("\n~~~~~~~~~~~~~ SECTION 3 : Copy Instance ~~~~~~~~~~~~~\n")
    copyInstance()

}


/*===================================
SECTION 1 : Print as String
============================

The toString() function is automatically called when you print the object.
*/

fun printAsString() {
    val user = User("Alex", 1)
    println(user)  // Output: User(name=Alex, id=1)
}



/*===================================
SECTION 2 : Compare Instances
============================

Use the equality operator == to compare two data class instances
*/

fun compareInstances() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)
    
    println(user == secondUser)  // Output: true
    println(user == thirdUser)   // Output: false
}


/*===================================
SECTION 3 : Copy Instance
============================

Use the copy() function to create a copy of a data class instance. 
You can also modify properties when copying.
*/
fun copyInstance() {
    val user = User("Alex", 1)

    // Exact copy of user
    println(user.copy()) // Output: User(name=Alex, id=1)

    // Copy with modified name
    println(user.copy(name = "Max")) // Output: User(name=Max, id=1)

    // Copy with modified id
    println(user.copy(id = 3)) // Output: User(name=Alex, id=3)
}
