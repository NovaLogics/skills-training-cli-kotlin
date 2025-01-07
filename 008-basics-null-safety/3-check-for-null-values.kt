/**
 * Checking for null values in Kotlin
 * 
 * You can check for null values using conditional expressions, such as 'if' statements.
 * In the example below, we use an 'if' condition to check if the string is not null and has a length greater than zero.
 * 
 * Example:
 * 
 */
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    val nullString: String? = null
    println(describeString(nullString)) 
}

