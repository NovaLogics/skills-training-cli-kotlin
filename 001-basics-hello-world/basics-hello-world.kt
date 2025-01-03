fun main() {
    println("\n~~~~~~~~~~~~~ SECTION 1 ~~~~~~~~~~~~~\n")

    println("Hello, world!")
    // Output: Hello, world!

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n")

    print("Hello, ")
    println("world!")
    // Output: Hello, world!

    println("\n~~~~~~~~~~~~~ SECTION 2 ~~~~~~~~~~~~~\n")

    // There are 5 boxes of popcorn
    val popcorn = 5

    // There are 7 hotdogs
    val hotdog = 7

    // There are 10 customers in the queue
    var customers = 10

    // Some customers leave the queue
    customers = 8

    print("Customer Count : ")
    println(customers)
    // Output: Customer Count : 8

    println("\n~~~~~~~~~~~~~ SECTION 3 ~~~~~~~~~~~~~\n")

    val customerCount = 10

    println("There are $customerCount customers")
    // Output: There are 10 customers

    println("There are ${customerCount + 1} customers") 
    // Output: There are 11 customers
}



//Source : https://kotlinlang.org/docs/kotlin-tour-hello-world.html

/*==========================
SECTION 1 : Hello, world!
============================
- `fun` is used to declare a function

- The `main()` function is where your program starts from

- The body of a function is written within curly braces `{}`
_____________________________

- `println()` and `print()` functions print their arguments to standard output

`println()` adds a newline at the end of the output.
`print()` does not add a newline; it keeps the cursor on the same line.

 */

 
/*==========================
SECTION 2 : Variables
============================
- Mutable variables with `var`

- Read-only variables with `val`
    You can't change a read-only variable once you have given it a value.

- To assign a value, use the assignment operator `=`

- Variables can be declared outside the `main()` function at the beginning of your program. 
    Variables declared in this way are said to be declared at `top level`.

-* Kotlin recommend that you declare all variables as read-only (val) by default. 
    Declare mutable variables (var) only if necessary.

 */

 /*==========================
SECTION 3 : String templates
============================
- What is a String Template?
    A way to include variables or expressions inside a string.

- How to Use It:
    Start with a dollar sign `$` to include a variable.
    Use curly braces `{}` after `$` to evaluate a piece of code.

- String Basics:
    Strings are sequences of characters wrapped in double quotes `""`

 */


