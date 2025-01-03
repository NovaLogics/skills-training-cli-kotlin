/*==========================
Test 1 : Conditional expressions practice
============================

Create a simple game where you win if throwing two dice results in the same number.
Use if to print
You win :) if the dice match
or
You lose :( otherwise.

In this exercise, you import a package so that you can use the
Random.nextInt() function to give you a random Int.

Hint
Use the equality operator (==) to compare the dice results.

----------------------

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here
}

*/

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    if (firstResult == secondResult) {
        println("You win :)")
    } else {
        println("You lose :(")
    }

    // val result = if (firstResult == secondResult) "You win :)" else "You lose :("
    // println(result)
}







 /*==========================
 Test 2
 ============================
Using a when expression, update the following program so that it prints 
the corresponding actions when you input the names of game console buttons.

Button      Action

A           Yes
B           No
X           Menu
Y           Nothing
Other       There is no such button

fun main() {
    val button = "A"

    println(
        // Write your code here
    )
}

 */


//  fun main() {
//     val button = "A"

//     println(
//         when(button){
//             "A" -> "Yes"
//             "B" -> "No"
//             "X" -> "Menu"
//             "Y" -> "Nothing"
//             else -> "There is no such button"
//         }
//     )
// }














 /*==========================
 Test 3
 ============================
 Define a map that relates integer numbers from 1 to 3 to their corresponding spelling.
 Use this map to spell the given number.

 fun main() {
     val number2word = // Write your code here
     val n = 2
     println("$n is spelt as '${<Write your code here >}'")
 }
 */





// fun main() {
//     val number2word = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
//     val n = 2
//     println("$n is spelt as '${number2word[n]}'")
// }
