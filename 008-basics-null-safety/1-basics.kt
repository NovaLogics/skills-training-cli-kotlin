/* Null Safety in Kotlin

> Purpose: 
    Kotlin's null safety system helps prevent issues that could arise when working with null values. 
    It ensures that null values are handled safely, detecting potential problems at compile time instead of runtime.
*/

/**
 * Key Features of Kotlin's Null Safety
 * 
 * 1. Explicit Declaration of Nullability:
 * - You can declare when a variable can hold a null value.
 * - Use ? to declare a nullable type:
 *   var name: String? = null
 * - Without ?, the variable can't hold null:
 *   var name: String = "Alex"  // Cannot be null
 * 
 * 2. Checking for Null Values:
 * - You can check if a variable is null using ?. (safe call operator).
 *   val length = name?.length  // Returns null if name is null, otherwise returns length
 * 
 * 3. Safe Calls:
 * - Safe calls allow you to access properties or call functions on a nullable variable without causing a NullPointerException.
 *   val length = name?.length  // Returns null if name is null
 * 
 * 4. Elvis Operator (? :):
 * - The Elvis operator allows you to provide a default value when a nullable variable is null.
 *   val length = name?.length ?: 0  // If name is null, returns 0
 * 
 * 5. Null Assertions (!!):
 * - Use !! to assert that a variable is not null. If the variable is null, it will throw a NullPointerException.
 *   val length = name!!.length  // Throws NullPointerException if name is null
 */


fun main() {
    var name: String? = null
    println(name?.length)  // Output: null

    name = "Kotlin"
    println(name?.length)  // Output: 6

    // Using Elvis operator
    val length = name?.length ?: 0
    println(length)  // Output: 6

    // Using !! operator (be careful)
    println(name!!.length)  // Output: 6
}

