/* Lambda Expressions in Kotlin

- Lambda Expression:
    * A lambda expression is a concise way to define functions.
    * It allows you to write function logic in a more compact format.

- Syntax:
    * A lambda expression consists of parameters (if any) followed by -> and the body of the function.
    * It can be assigned to a variable and invoked like a regular function.

- Advantages:
    * Reduces verbosity.
    * Often used with higher-order functions like map, filter, etc.

Notes:
    * The lambda upperCaseString is assigned to a variable and works similarly to the traditional function uppercaseString.
    * You can use lambda expressions to make your code more concise, 
        especially when passing functions as arguments to other functions.

----------------------------------------------

fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun main() {
    println(uppercaseString("hello"))
    // Output: HELLO
}

*/


fun main() {
    // Define the lambda expression
    val upperCaseString = { text: String -> text.uppercase() }

    // Call the lambda
    println(upperCaseString("hello"))
    // Output: HELLO
}


