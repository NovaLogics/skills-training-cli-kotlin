/* Functions in Kotlin

- Declaring Functions:
    * Use the fun keyword to declare a function.
    Example:
    fun hello() {
        println("Hello, world!")
    }

- Function Parameters:
    * Parameters are placed within parentheses ()
    * Each parameter must have a type.
    * Multiple parameters are separated by commas ,
    Example: 
        fun greet(name: String, age: Int)

- Return Type:
    * The return type is specified after the parameters, separated by a colon :.
    * If the function doesn't return a value, the return type can be omitted, 
        or Unit (equivalent to void in other languages) is used.
    Example: 
        fun sum(x: Int, y: Int): Int

- Return Keyword:
    * Use the return keyword to return a value from the function.
    Example:
        fun sum(x: Int, y: Int): Int {
            return x + y
        }

- Function Naming Convention:
    * Functions should start with a lowercase letter and use camel case without underscores.
    Example: 
        fun calculateTotal()

Notes:
If a function does not return anything useful, 
you can omit the return type and the return keyword.
 */

 // Function with parameters and return type
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    println(sum(1, 2))  // Output: 3
}
