/**
 * Safe Calls in Kotlin
 *
 * To access properties of an object that may be null, use the safe call operator (?.). This allows
 * you to safely access properties without triggering a NullPointerException if the object or any of
 * its properties are null.
 *
 */

 fun lengthString(maybeString: String?): Int? = maybeString?.length

/**
 * Safe calls can also be chained to safely access nested properties:
 *
 * person.company?.address?.country
 *
 * Additionally, you can safely call extension or member functions on nullable objects. If the
 * object is null, the function call is skipped:
 */

fun main() {
    val nullString: String? = null
    println(nullString?.uppercase()) // Output: null

    println(lengthString(nullString)) // Output: null
}
