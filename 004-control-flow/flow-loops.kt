fun main() {
    println("\n~~~~~~~~~~~~~ SECTION 1 : Ranges ~~~~~~~~~~~~~\n")
    rangesSection()

    println("\n~~~~~~~~~~~~~ SECTION 2 : Loops ~~~~~~~~~~~~~\n")

    println(":::::::::::::: For Loop ::::::::::::::\n")
    forLoops()

    println("\n:::::::::::::: While Loop ::::::::::::::\n")
    whileLoops()
}

/*==========================
SECTION 1 : Ranges in Kotlin
============================
- Creating a Range:
    * Use the .. operator to create an inclusive range.
    Example:
    1..4 → 1, 2, 3, 4.

- Exclusive Range:
    * Use ..< for a range that excludes the end value.
    Example:
    1..<4 → 1, 2, 3.

- Reversed Range:
    * Use downTo for a range in reverse order.
    Example:
    4 downTo 1 → 4, 3, 2, 1.

- Custom Step:
    * Use step to define a custom increment.
    Example:
    1..5 step 2 → 1, 3, 5.

Character Ranges:
    'a'..'d' → 'a', 'b', 'c', 'd'

    'z' downTo 's' step 2 → 'z', 'x', 'v', 't'.


Note:
Ranges are commonly used in loops to iterate over a sequence of values.

 */

fun rangesSection() {

    // Inclusive range
    val inclusiveRange = 1..4
    println("Inclusive range: $inclusiveRange")
    println(inclusiveRange.joinToString()) // Output: 1, 2, 3, 4

    println()

    // Exclusive range
    val exclusiveRange = 1 ..< 4
    println("Exclusive range: $exclusiveRange")
    println(exclusiveRange.joinToString()) // Output: 1, 2, 3

    println()

    // Reversed range
    val reversedRange = 4 downTo 1
    println("Reversed range: $reversedRange")
    println(reversedRange.joinToString()) // Output: 4, 3, 2, 1

    println()

    // Custom step
    val stepRange = 1..5 step 2
    println("Step range: $stepRange")
    println(stepRange.joinToString()) // Output: 1, 3, 5

    println()

    // Character range
    val charRange = 'a'..'d'
    println("Character range: $charRange")
    println(charRange.joinToString()) // Output: a, b, c, d

    println()

    // Reversed character range with step
    val reversedCharRange = 'z' downTo 's' step 2
    println("Reversed character range with step: $reversedCharRange")
    println(reversedCharRange.joinToString()) // Output: z, x, v, t
}

/*==========================
SECTION 2.1 : Loops in Kotlin
============================
- `For` Loop:
    * Used to iterate over a range of values.
    Example:
    for (i in 1..5) { println(i) }
    → Prints 1, 2, 3, 4, 5.

- `While` Loop:
    * Continues to perform an action as long as a condition is true.
    var count = 1
    while (count <= 5) {
        println(count)
        count++
    }
    → Prints 1, 2, 3, 4, 5.

Notes:
Use `for` when iterating over collections or ranges.
Use `while` when a condition dynamically controls the loop.
 */

fun forLoops() {
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    // 12345

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    // Yummy, it's a carrot cake!
    // Yummy, it's a cheese cake!
    // Yummy, it's a chocolate cake!
}

/*==========================
SECTION 2.2 : While in Kotlin
============================
- `while` can be used in two ways:
    * To execute a code block while a conditional expression is true. (while)
    * To execute the code block first and then check the conditional expression. (do-while)

- In the first use case (while):
    * Declare the conditional expression for your while loop to continue within parentheses `()`
    * Add the action you want to complete within curly braces `{}`

- In the second use case (do-while):
    * Declare the conditional expression for your while loop to continue within parentheses `()`
    * Define the action you want to complete within curly braces `{}` with the keyword `do`
 */

fun whileLoops() {

    // The following examples use the increment operator ++ to increment the value of the cakesEaten
    // variable.

    var cakesEatenByMe = 0

    while (cakesEatenByMe < 3) {
        println("Eat a cake")
        cakesEatenByMe++
    }
    // Eat a cake
    // Eat a cake
    // Eat a cake

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    // Eat a cake
    // Eat a cake
    // Eat a cake
    // Bake a cake
    // Bake a cake
    // Bake a cake
}
