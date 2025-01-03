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

    println("\n~~~~~~~~~~~~~ SECTION : List ~~~~~~~~~~~~~\n")
    listType()
}

/*==========================
SECTION 1 : List
============================
- What are Lists?
    Lists store items in the order they are added.
    They allow duplicate items.

- Types of Lists:
    Read-only List: Use the `listOf()` function to create.
    Mutable List: Use the `mutableListOf()` function to create.

- Type Declaration:
    Kotlin can automatically infer the type of items in a list.
    To declare the type explicitly, use angled brackets `<>` after the list declaration.

Example:
val numbers: List<Int> = listOf(1, 2, 3)      // Read-only List
val mutableNumbers: MutableList<String> = mutableListOf("A", "B") // Mutable List

 */

fun listType() {

    // Read-only list

    // val readOnlyColors= listOf("Red", "Green", "Blue") OR
    val readOnlyColors: List<String> = listOf("Red", "Green", "Blue")
    println("Read-only List: $readOnlyColors")
    // Output: Read-only List: [Red, Green, Blue]

    // Mutable list
    val mutableFruits: MutableList<String> = mutableListOf("Apple", "Banana", "Orange")
    println("\n||---> @readOnlyShapes = $mutableFruits")
    // Adding a new item
    mutableFruits.add("Grapes")

    println("Mutable List after adding a fruit: $mutableFruits")
    // Output: Mutable List after adding a fruit: [Apple, Banana, Orange, Grapes]

    // To prevent unwanted modifications, you can create a read-only view of a mutable list by
    // assigning it to a List:
    val shapesList: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesListLocked: List<String> = shapesList
    // This is also called `casting`

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("\n||---> @readOnlyShapes = $readOnlyShapes \n")

    /*
    Lists are ordered so to access an item in a list, use the indexed access operator []
    */
    println("|-> readOnlyShapes[0] |")
    println("The first item in the list is: ${readOnlyShapes[0]}")
    // The first item in the list is: triangle

    /*
    To get the first or last item in a list, use .first() and .last() functions respectively
    */
    println("\n|-> readOnlyShapes.first() |")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    // The first item in the list is: triangle 


    /*
    .first() and .last() functions are examples of extension functions.
    To call an extension function on an object, write the function name after the object appended with a period `.`
    */
    println("\n|->  readOnlyShapes.count() |")
    println("This list has ${readOnlyShapes.count()} items ")


    /*
    To check that an item is in a list, use the in operator:
    */
    println("\n|-> \"circle\" in readOnlyShapes  |")
    print("circle" in readOnlyShapes)


    println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    /*
    To add or remove items from a mutable list, use .add() and .remove() functions respectively:
    */
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println("\n||---> @shapes = $shapes \n")
    // Add "pentagon" to the list
    shapes.add("pentagon")
    println("|-> shapes.add(\"pentagon\") |")
    println("$shapes items")
    // [triangle, square, circle, pentagon]

    // Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println("\n|-> shapes.remove(\"pentagon\") |")
    println("$shapes items")
    // [triangle, square, circle]

}
