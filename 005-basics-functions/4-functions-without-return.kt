/* Functions Without Return

- Unit Return Type:
    * If a function doesn’t return a value, its return type is Unit.
    * Unit is a type with only one value, also called Unit.

- Implicit Declaration:
    * You don’t need to explicitly declare the return type as Unit.
    * The return keyword is optional in these functions.

Notes:
* Functions without return types are often used for performing actions like printing, updating UI, or logging.
* Kotlin makes such functions concise by eliminating the need for explicit return Unit statements.
 */

fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}

// fun printMessage(message: String): Unit {
//     println(message)
//     // `return Unit` or `return` is optional
// }

fun main() {
    printMessage("Hello")  
    // Output: Hello
}


