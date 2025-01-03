/* Named Arguments in Kotlin

- Named Arguments:
    * Allows you to specify parameter names when calling a function.
    * Improves code readability and clarity.

- Order Flexibility:
    * When using named arguments, the order of parameters can be swapped.

Notes:
Named arguments are optional; you can still call functions without specifying parameter names.
They are particularly helpful in functions with multiple parameters or default values.
 */

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun main() {
    // Named arguments with swapped order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // Output: [Log] Hello
}
