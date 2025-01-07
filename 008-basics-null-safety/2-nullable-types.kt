/**
 * Nullable types in Kotlin
 *
 * Kotlin allows variables to have nullable types, which means they can hold null values. By
 * default, types are non-nullable. To allow nulls, explicitly add ? after the type.
 *
 * Example:
 */
fun main() {
    // neverNull has String type (non-nullable)
    var neverNull: String = "This can't be null"

    // Throws a compiler error because 'neverNull' can't be null
//    neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK, nullable can hold null
    nullable = null

    // By default, null values aren't accepted in inferredNonNull
    var inferredNonNull = "The compiler assumes non-nullable"

    // Throws a compiler error because inferredNonNull can't be null
//    inferredNonNull = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
    // Throws a compiler error because 'nullable' is nullable
//    println(strLength(nullable)) // Compiler error
}
