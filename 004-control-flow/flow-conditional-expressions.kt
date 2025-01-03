fun main() {
    println("\n~~~~~~~~~~~~~ SECTION 1 : If operations ~~~~~~~~~~~~~\n")
    ifExpression()

    println("\n~~~~~~~~~~~~~ SECTION 2 : When operations ~~~~~~~~~~~~~\n")
    whenExpression()
}

/* Conditional Expressions in Kotlin
Kotlin provides two main ways to check conditions: `if` and `when`

- `if` Expression
    * Used for simple conditions, similar to other languages.
    * Can be used as an expression, meaning it can return a value.

- when Expression
    * Used for multiple conditions.
    * Works like a switch statement in other languages but is more flexible.
    * Preferred in Kotlin because it:
    * Improves readability by clearly showing the branches.
    * Easier to extend by adding more branches.
    * Reduces mistakes in logic by handling multiple conditions in one place.

Key Points:
    * `if` : Best for simple conditions.
    * `when` : Best for multiple conditions and is easier to maintain.
*/

/*==========================
SECTION 1 : Using `if` in Kotlin
============================
In Kotlin, the if statement is used to check conditions,
and it can be used as an expression, meaning it can return a value.
Here's how it works:

- Basic if-else:
    * Use if to evaluate a condition and execute one block of code if the condition is true, and another block if it is false.

- No ternary operator:
    * Kotlin does not have a ternary operator (condition ? then : else) like some other languages.
      Instead, you use if in a more straightforward way.

- Optional curly braces:
    * If there's only one statement per block, you can omit the curly braces {}

Key Notes:
    * if as a statement: Executes different blocks of code based on a condition.
    * if as an expression: Returns a value based on the condition, no need for a ternary operator.
    * Optional curly braces: If you have a single statement in each block, curly braces are not required.

 */
fun ifExpression() {
    // Regular if-else statement
    val isConditionMet = true
    val result: Int

    if (isConditionMet) {
        result = 1 // Assign 1 if isConditionMet is true
    } else {
        result = 2 // Assign 2 if isConditionMet is false
    }
    println("Result: $result")
    // Output: 1

    // Using if as an expression
    val firstNumber = 1
    val secondNumber = 2
    print("Larger value: ")
    println(if (firstNumber > secondNumber) firstNumber else secondNumber)
    // Output: 2
}

/*==========================
SECTION 2 : Using `when` in Kotlin
============================
The when keyword is used for conditional expressions with multiple branches.
It is a flexible and readable alternative to if-else chains.

Key Points:

- Purpose:
    * Use `when` to evaluate a value and perform actions or return results based on conditions.

- Structure:
   * Place the value to evaluate in parentheses `()`
   * Define branches in curly braces `{}`
   * Use `->` to separate each condition from its action

- Types of when Usage:
   * As a Statement: Executes actions but does not return a value.
   * As an Expression: Returns a value that can be assigned to a variable.

- Benefits of when:
   * Readability: Makes code easier to follow compared to long `if-else` chains.
   * Maintainability: Adding new branches is simple.
   * Subject Usage: Improves readability and ensures all possible cases are covered (especially for enums).

- Note:
   * When no subject is used, an else branch is mandatory to handle any unmatched cases.
   * When a subject is used, Kotlin can validate whether all possible cases are covered.

 */
fun whenExpression() {
    // Example

    println("obj ='Hello' \n")

    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }
    // Greeting

    /*
    Note that all branch conditions are checked sequentially until one of them is satisfied.
    So only the first suitable branch is executed.
    */

    /*
    An expression returns a value that can be used later in your code.

    Here is an example of using when as an expression.
    The when expression is assigned immediately to a variable which is later used with the println() function:
    */

    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println("result: $result")
    // Greeting

    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    /*
    The examples of when that you've seen so far both had a subject: obj. 
    But when can also be used without a subject.
    */

    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"
    println("trafficLightState> $trafficLightState")

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println("trafficAction: $trafficAction")
    // Stop


    val trafficActionResult = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println("trafficActionResult: $trafficActionResult")

}
