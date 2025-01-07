/* Lambda Expressions in Kotlin
- Uses of Lambda Expressions:
    * Pass a lambda as a parameter to another function.
    |*| Return a lambda from a function.
    * Invoke a lambda directly.
*/

fun main(){
    println("\n~~~~~~~~~~~~~ SECTION 1 : Returning Lambda Expressions ~~~~~~~~~~~~~\n")
    returningLambdaExpressions()
}


/*===================================
SECTION 1 : Returning Lambda Expressions
============================

> Lambda expressions can be returned from a function, allowing for highly flexible and reusable code.

> Key Requirements
    * To return a lambda, you must declare the function type of the lambda expression.
    * Example: (Int) -> Int means the lambda takes an Int as input and returns an Int.

> Example: toSeconds Function

    The toSeconds() function:
    * Takes a String (e.g., "hour", "minute", "second").
    * Returns a lambda that converts time values to seconds.
*/

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }    // Converts hours to seconds
    "minute" -> { value -> value * 60 }      // Converts minutes to seconds
    "second" -> { value -> value }           // Seconds remain unchanged
    else -> { value -> value }               // Default: Returns the value as-is
}


fun returningLambdaExpressions() {

    val timesInMinutes = listOf(2, 10, 15, 1) // List of times in minutes

    val min2sec = toSeconds("minute") // Get lambda for minute-to-second conversion

    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum() // Convert & sum in seconds

    println("Total time is $totalTimeInSeconds secs")
    // Output: Total time is 1680 secs

}

/* How It Works:

> Function Type:
    - toSeconds returns (Int) -> Int, meaning a lambda that takes an Int and returns an Int.

> when Expression:
Based on the input ("hour", "minute", "second"), it returns the appropriate lambda:
    - "hour": Multiplies the input by 3600.
    - "minute": Multiplies the input by 60.
    - "second": Returns the input unchanged.
    - Default: Returns the input unchanged.

> map with Lambda:
    - The toSeconds("minute") function returns the "minute" lambda.
    - timesInMinutes.map(min2sec) converts each minute to seconds in the list.

> Sum:
    - .sum() adds all the converted values.
*/
