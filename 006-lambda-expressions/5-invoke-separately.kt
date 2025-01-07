/* Lambda Expressions in Kotlin
- Uses of Lambda Expressions:
    * Pass a lambda as a parameter to another function.
    * Return a lambda from a function.
    |*| Invoke a lambda directly.
*/

fun main(){
    println("\n~~~~~~~~~~~~~ SECTION 1 : Invoking Lambda Expressions Directly ~~~~~~~~~~~~~\n")
    invokingLambdaExpressionsDirectly()

    println("\n~~~~~~~~~~~~~ SECTION 2 : Trailing Lambdas ~~~~~~~~~~~~~\n")
    trailingLambdas()
}


/*===================================
SECTION 1 : Invoking Lambda Expressions Directly
============================

> Invoking Lambda Expressions Directly
    * You can invoke a lambda expression directly by adding parentheses `()` after the curly braces `{}`
    * Pass any required parameters inside the parentheses.

*/

fun invokingLambdaExpressionsDirectly() {

    println({ text: String -> text.uppercase() }("hello"))
    // Output: HELLO

}



/*===================================
SECTION 2 : Trailing Lambdas
============================

> Trailing lambda: A special syntax for lambda expressions used as the last parameter of a function.
> If a lambda is the only parameter, you can omit the function's parentheses () entirely.

Example with `.fold()` :
The .fold() function:
    * Takes an initial value and a lambda operation.
    * The lambda operates cumulatively on each element of the list.

*/

fun trailingLambdas() {

    // Standard syntax
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // Output: 6

    // Trailing lambda syntax
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item }) // Output: 6
}

/*
How It Works:
> Without Trailing Lambda:
    - The lambda is passed as the second argument inside the parentheses.
    - Example: .fold(0, { x, item -> x + item }).

> With Trailing Lambda:
    - The lambda is moved outside the parentheses because it's the last parameter. 
    Example: .fold(0) { x, item -> x + item }.
*/
