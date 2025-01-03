/* Collections in Kotlin
    Collections are used to group and organize data for processing.
    Kotlin offers three main types of collections:

    - Lists:
        A sequence of items arranged in a specific order.
        Items can be repeated.

    - Sets:
        A collection of unique items, with no specific order.
        Duplicates are not allowed.

    - Maps:
        A collection of key-value pairs where each key is unique.
        Keys are used to map to specific values.

    Collections can be either:
        Read-only: Cannot be changed after creation.
        Mutable: Can be modified (add, remove, or update items).
*/

fun main() {

    println("\n~~~~~~~~~~~~~ SECTION : Set ~~~~~~~~~~~~~\n")
    typeSet()
}

/*==========================
SECTION : Set
============================
- What are Sets?
    Sets store unique items and do not allow duplicates.
    They are unordered, meaning the order of items is not guaranteed.

- Types of Sets:
    Read-only Set: Use the `setOf()` function to create.
    Mutable Set: Use the `mutableSetOf()` function to create.

- Type Declaration:
    Kotlin can infer the type of items in a set.
    To declare the type explicitly, use angled brackets `<>` after the set declaration.

Explanation:
Read-only set: We use `setOf()` to create a set that automatically removes duplicates.
Mutable set: We use `mutableSetOf()` and can modify the set by adding or removing items.

 */

fun typeSet() {

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println("\n||---> @readOnlyFruit = $readOnlyFruit \n")
    // Output: Read-only Set: [apple, banana, cherry] (duplicates removed)

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println("\n||---> @fruit = [apple, banana, cherry, cherry] \n")

    fruit.add("orange") // Adding a new item
    println("Mutable Set after adding a fruit: $fruit")
    // Output: Mutable Set after adding a fruit: [apple, banana, cherry, orange]

    /* **
    You can see in the previous example that because sets only contain unique elements, the duplicate "cherry" item is dropped.
    */

    /*
    To prevent unwanted modifications, you can create a read-only view of a mutable set by assigning it to a Set:
    */
    val fruitSet: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    val fruitSetLocked: Set<String> = fruitSet

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    println("\n||---> @fruitSet = $fruitSet \n")

    /*
    As sets are `unordered`, you can't access an item at a particular index.
    */
    println("|-> fruitSet.elementAt(0) |")
    println("The first item in the Set is: ${fruitSet.elementAt(0)}")

    println("\n|-> fruitSet.indexOf(\"apple\") |")
    println("The index of element is: " + fruitSet.indexOf("apple"))

    /*
    To get the number of items in a set, use the .count() function:
    */
    println("\n|-> fruitSet.count() |")
    println("This set has ${fruitSet.count()} items")

    /*
    To check that an item is in a set, use the in operator:
    */
    println("\n|-> \"banana\" in fruitSet |")
    println("banana" in fruitSet)

    /*
    To add or remove items from a mutable set, use .add() and .remove() functions
    */
    // Add "dragonfruit" to the set
    fruitSet.add("dragonfruit")
    println("\n|-> fruitSet.add(\"dragonfruit\") |")
    println("||---> @fruitSet = $fruitSet")
    // [apple, banana, cherry, dragonfruit]

    // Remove "dragonfruit" from the set
    fruitSet.remove("dragonfruit")
    println("\n|-> fruitSet.remove(\"dragonfruit\") |")
    println("||---> @fruitSet = $fruitSet \n")
    // [apple, banana, cherry]

}
