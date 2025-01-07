/* Lambda Expressions Explained

Lambda expressions in Kotlin are a concise way to define anonymous functions. 
Here's a breakdown of how they work:

Structure of a Lambda Expression:

- Curly Braces {}: 
    * The entire lambda expression is wrapped in curly braces.

- Parameters: 
    * You can declare parameters inside the curly braces, followed by ->.
    Example: 
    { text: String -> ... }

- Function Body: 
    * After ->, you write the logic that the lambda performs.
    Example: 
    { text: String -> text.uppercase() }

If there are no parameters, the -> is omitted:
    Example: 
    { println("Log message") }

----------------------------------------------
Summary:
Lambda syntax: { parameters -> body }
Assignment: Lambda expressions can be assigned to variables.
Calling Lambda: The variable holding the lambda is called just like a function.
*/


fun main() {
    // Define the lambda expression
    val upperCaseString = { text: String -> text.uppercase() }

    // Call the lambda
    println(upperCaseString("hello"))
    // Output: HELLO
}

/* Lambda Expression Example:

- Parameters: 
    text is the parameter of type String.
- Function Body: 
    text.uppercase() is the body, where the function converts text to uppercase.
- Assignment: 
    The lambda is assigned to the upperCaseString variable.
- Calling Lambda: 
    The lambda is invoked by calling upperCaseString("hello").
*/


//----------------------------------------------

// fun main() {
//     // Lambda without parameters
//     val logMessage = { println("Log message") }
    
//     // Calling the lambda
//     logMessage()
//     // Output: Log message
// }

//----------------------------------------------

/* Lambda Without Parameters:

- No Parameters: 
    Since no parameters are used, -> is not required.
- Function Body: 
    The body of the lambda simply prints "Log message".

*/


