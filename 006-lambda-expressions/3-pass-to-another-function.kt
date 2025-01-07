/* Lambda Expressions in Kotlin
- Uses of Lambda Expressions:
    |*| Pass a lambda as a parameter to another function.
    * Return a lambda from a function.
    * Invoke a lambda directly.
*/

fun main(){
    println("\n~~~~~~~~~~~~~ SECTION 1 : Pass to another function : ex. Filter ~~~~~~~~~~~~~\n")
    passingToAnotherFunctionExFilter()

    println("\n~~~~~~~~~~~~~ SECTION 2 : Pass to another function : ex. Map ~~~~~~~~~~~~~\n")
    passingToAnotherFunctionExMap()

    println("\n~~~~~~~~~~~~~ SECTION 3 : Function Types ~~~~~~~~~~~~~\n")
    functionTypes()
}


/*===================================
SECTION 1 : Pass to another function : ex. Filter
============================

- Example with   `.filter()`
    * Filters items in a collection based on a condition.

- Key Points:
    * Lambda can be passed directly to the .filter() function.
    * Lambda can also be assigned to a variable (e.g., isNegative) and then passed to the function.

- Trailing Lambda:
    * If the lambda is the only parameter, parentheses can be omitted:
         val positives = numbers.filter { x -> x > 0 }

*/

fun passingToAnotherFunctionExFilter() {

    println("FILTER: ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n")

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // Keeps only positive numbers
    val positives = numbers.filter { x -> x > 0 } 

    val isNegative = { x: Int -> x < 0 }

    // Keeps only negative numbers
    val negatives = numbers.filter(isNegative) 

    println(positives) // Output: [1, 3, 5]
    println(negatives) // Output: [-2, -4, -6]
}



/*===================================
SECTION 2 : Pass to another function : ex. Map
============================

* The .map() function is used to transform each element in a collection by applying a given lambda expression.

* It creates a new list where each element is the result of the transformation.

-----------------------
- Key Points:
    * .map() always returns a new list without modifying the original one.
    * The lambda specifies the transformation logic for each element.
    * You can use .map() for various transformations, such as:
        > Scaling numbers
        > Converting data types (e.g., Int to String)
        > Applying complex operations to each item in the list.
-----------------------
*/

fun passingToAnotherFunctionExMap() {

    println("MAP: ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n")

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // Multiply each number by 2 using a lambda
    val doubled = numbers.map { x -> x * 2 }       
    
    // Multiply each number by 3 using a predefined lambda
    val isTripled = { x: Int -> x * 3 }

    val tripled = numbers.map(isTripled)
    
    println(doubled)  // Output: [2, -4, 6, -8, 10, -12]
    println(tripled)  // Output: [3, -6, 9, -12, 15, -18]

}



/*===================================
SECTION 3 : Function Types
============================

> Functions in Kotlin also have types, just like variables and objects.
> function type defines:
    * Parameter types: The types of inputs the function accepts.
    * Return type: The type of value the function returns.

-----------------------
> Syntax for Function Types
    - Format:
      (parameterType1, parameterType2, ...) -> returnType
        Examples:
        * (String) -> String → A function that takes one `String` and returns a `String`.
        * (Int, Int) -> Int → A function that takes two `Int` values and returns an `Int`.

    - For no parameters:
        * Use empty parentheses: () -> Unit.

-----------------------

> Why Function Types Matter
    - Clarity: They make it clear what inputs and outputs a function expects.
    - Reusability: Functions can be passed around as values.
    - Type Safety: The compiler ensures only functions of the specified type are used.


*/

fun functionTypes() {

    /* Defining a Function Type */
  val upperCaseString: (String) -> String = { text -> text.uppercase() }

  println(upperCaseString("hello"))  // Output: HELLO

  println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n")

    /* Function with No Parameters */

    val printLog: () -> Unit = { println("Log message") }

    printLog()  // Output: Log message
}


/*===================================
SECTION 3 : Function Types : Notes
============================

> You must either:
    - Specify parameter and return types explicitly in the lambda.
    - OR define a function type for the variable holding the lambda.

----------------------------------------------
Example of Invalid Code:

    val upperCaseString = { str -> str.uppercase() }  // Won't work, type is missing.

    Fix by specifying the type:
    val upperCaseString: (String) -> String = { str -> str.uppercase() }

----------------------------------------------

Use function types when:
    - Assigning lambda expressions to variables.
    - Passing functions as parameters to other functions.
*/
