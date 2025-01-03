fun main() {
    println("_____________ SECTION 1 _____________")

    println("Hello, world!")
    // Output: Hello, world!

    println("_____________________________________")

    print("Hello, ")
    println("world!")
    // Output: Hello, world!

    println("_____________________________________")
    println("_____________ SECTION 2 _____________")

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


