/* Single-Expression Functions in Kotlin

- Concise Functions:
    * Single-expression functions allow you to write more concise code.
    * The function body can be written in one line using the = operator instead of using curly braces {} and return.

- Type Inference:
    * When using a single-expression function, 
    Kotlin automatically infers the return type, 
    but you can still explicitly define it for clarity.

- No Return Keyword:
    * The return keyword is not needed in a single-expression function.
    * The return value is automatically inferred.

Notes:
    * Single-expression functions are ideal for simple operations, making your code cleaner.
    * It’s a good practice to define the return type explicitly, even in single-expression functions, for better readability.
    * If you use {} in the function body, you must specify the return type unless it's Unit.
 */


 fun sum(x: Int, y: Int) = x + y  // Single-expression function

 //  fun sum(x: Int, y: Int): Int {
//     return x + y
// }

 fun main() {
     println(sum(1, 2))  
     // Output: 3
 }
 


