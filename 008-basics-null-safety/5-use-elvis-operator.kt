/**
 * Elvis Operator in Kotlin
 *
 * The Elvis operator (?:) allows you to provide a default value when a nullable expression results
 * in null. This helps avoid null pointer exceptions and allows for fallback values.
 *
 * Syntax: expression?.property ?: defaultValue
 *
 * In the example below, the nullString is null, so the safe call (?.) results in a null value. The
 * Elvis operator (?:) provides a default value (0) in place of the null value:
 */
fun main() {
    val nullString: String? = null
    println(nullString?.length ?: 0) // Output: 0
}
