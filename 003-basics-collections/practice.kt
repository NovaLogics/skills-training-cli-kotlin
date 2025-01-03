 /*==========================
Test 1 
============================
You have a list of “green” numbers and a list of “red” numbers. 
Complete the code to print how many numbers there are in total.

fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    // Write your code here
}
*/

//  fun main() {
//     val greenNumbers = listOf(1, 4, 23)
//     val redNumbers = listOf(17, 2)
//     // Write your code here
//     val totalCount = greenNumbers.count() + redNumbers.count()
//     println("Total : $totalCount")
// }




 /*==========================
Test 2
============================
You have a set of protocols supported by your server. 
A user requests to use a particular protocol.
Complete the program to check whether the requested protocol is supported or not 
(`isSupported` must be a Boolean value).

Hint
Make sure that you check the requested protocol in upper case. 
You can use the .uppercase() function to help you with this.

fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = // Write your code here 
    println("Support for $requested: $isSupported")
}
*/

// fun main() {
//     val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
//     val requested = "smtp"
//     val isSupported = requested.uppercase() in SUPPORTED
//     println("Support for $requested: $isSupported")
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

fun main() {
    val number2word = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}