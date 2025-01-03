/* Default Parameter Values in Kotlin

- Default Values:
    * Parameters in a function can have default values.
    * Default values are assigned using the = operator after the parameter's type.

- Optional Parameters:
    * If a parameter has a default value, it can be omitted when calling the function.

- Using Default Values:
    * If a value is not provided for a parameter, the default value is used.

Notes:
* Default parameter values improve flexibility and reduce the need for overloaded functions.
* Combine default values with named arguments for clear and concise function calls.

* You can skip specific parameters with default values, rather than omitting them all. 
    However, after the first skipped parameter, you must name all subsequent parameters.
 */

 fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    // Function called with both parameters
    printMessageWithPrefix("Hello", "Log")  
    // Output: [Log] Hello
    
    // Function called only with the message parameter
    printMessageWithPrefix("Hello")         
    // Output: [Info] Hello
    
    // Function called using named arguments
    printMessageWithPrefix(prefix = "Log", message = "Hello")  
    // Output: [Log] Hello
}

