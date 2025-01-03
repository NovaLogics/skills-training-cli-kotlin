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

    println("\n~~~~~~~~~~~~~ SECTION : Map ~~~~~~~~~~~~~\n")
    typeMap()
}

/*==========================
SECTION : Map
============================
- What are Maps?
    Maps store items as key-value pairs.
    You access the value using its key.
    Every key must be unique, but values can be duplicated.
    Useful for looking up values without using an index, like in a list.

- Types of Maps:
    Read-only Map: Use the `mapOf()` function to create.
    Mutable Map: Use the `mutableMapOf()` function to create.

- Type Declaration:
    Kotlin can infer the type of keys and values in a map.
    To declare the types explicitly, use angled brackets `<>` for keys and values, e.g., MutableMap<String, Int>.

- Creating a Map:
    Use to `to` link each key to its value.
    val map = mapOf(1 to "x", 2 to "y", -1 to "zz")

Explanation:
    Read-only map: We use mapOf() to create a map where keys are linked to values.
    Mutable map: We use mutableMapOf() to create a map that allows modification (adding or updating key-value pairs).

 */

fun typeMap() {

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("\n||---> @readOnlyJuiceMenu = $readOnlyJuiceMenu \n")
    // Output: Read-only Map: {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> =
            mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenu["mango"] = 120 // Adding a new key-value pair
    println("\n||---> @juiceMenu = $juiceMenu ")
    println("|-> juiceMenu[\"mango\"] = 120  |")
    println("Mutable Map after adding a juice: $juiceMenu")
    // Output: Mutable Map after adding a juice: {apple=100, kiwi=190, orange=100, mango=120}

    /*
    To prevent unwanted modifications, you can create a read-only view of a mutable map by assigning it to a Map:
    */
    val juiceMenuMap: MutableMap<String, Int> =
            mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    val juiceMenuMapLocked: Map<String, Int> = juiceMenuMap

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    println("\n||---> @fruitSet = $juiceMenuMap \n")

    /*
    To access a value in a map, use the indexed access operator [] with its key:
    */
    println("|-> juiceMenuMap[\"apple\"] |")
    println("The value of apple juice is: ${juiceMenuMap["apple"]}")
    // The value of apple juice is: 100

    /*
    If you try to access a key-value pair with a key that doesn't exist in a map, you see a null value:
    */
    println("\n|-> juiceMenuMap[\"pineapple\"] |")
    println("The value of pineapple juice is: ${juiceMenuMap["pineapple"]}")
    // The value of pineapple juice is: null

    /*
    You can also use the indexed access operator [] to add items to a mutable map:
    */
    juiceMenuMap["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println("\n|-> juiceMenu[\"coconut\"] = 150  |")
    println("||---> @fruitSet = $juiceMenuMap ")
    // {apple=100, kiwi=190, orange=100, coconut=150}

    /*
    To remove items from a mutable map, use the .remove() function:
    */
    juiceMenuMap.remove("orange") // Remove key "orange" from the map
    println("\n|-> juiceMenu.remove(\"orange\") |")
    println("||---> @fruitSet = $juiceMenuMap ")
    // {apple=100, kiwi=190, orange=100, coconut=150}

    /*
    To get the number of items in a map, use the .count() function:
    */
    println("\n|-> juiceMenuMap.count() |")
    println("This map has ${juiceMenuMap.count()} key-value pairs")
    // This map has 3 key-value pairs

    /*
    To get the number of items in a map, use the .count() function:
    */
    println("\n|-> juiceMenuMap.containsKey(\"kiwi\") |")
    println(juiceMenuMap.containsKey("kiwi"))
    // true

    println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    println("\n||---> @fruitSet = $juiceMenuMap \n")

    /*
    To obtain a collection of the keys or values of a map, use the keys and values properties respectively:
    */
    println("\n|-> juiceMenuMap.keys |")
    println(juiceMenuMap.keys)
    // [apple, kiwi, orange]

    println("\n|-> juiceMenuMap.values |")
    println(juiceMenuMap.values)
    // [100, 190, 100]


        /*
    To check that a key or value is in a map, use the in operator:
    */
    println("\n|-> \"kiwi\" in juiceMenuMap |")
    println("kiwi" in juiceMenuMap.keys)
    // true

    println("\n|-> 200 in juiceMenuMap.values |")
    println(200 in juiceMenuMap.values)
    // false

}
