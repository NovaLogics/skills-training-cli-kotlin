
fun main() {
    println("\n~~~~~~~~~~~~~ SECTION 1 : Arithmetic operations ~~~~~~~~~~~~~\n")
    arithmeticOperations()

    println("\n~~~~~~~~~~~~~ SECTION 2 : Basic types ~~~~~~~~~~~~~\n")
    basicTypes()
}


/*==========================
SECTION 1 : Arithmetic operations
============================
- What Are Types?
    - Every variable and data structure in Kotlin has a type.
    - Types define what operations (functions and properties) you can use with that variable.

- Type Inference:
    - Kotlin can automatically figure out the type of a variable based on its value.
    - This is called type inference.

    Example:
    val customers = 10  // Kotlin infers the type as Int
    println(customers + 5)  // Arithmetic operations are allowed since it's an Int

- Why Are Types Important?
    - They prevent errors by ensuring variables are used in valid ways.
    - Example: You can’t use string operations on an Int.


    +=, -=, *=, /=, and %= are augmented assignment operators.

 */
fun arithmeticOperations() {

    var customers = 10

    // Some customers leave the queue
    customers = 8

    customers = customers + 3 // Example of addition: 11

    customers += 7 // Example of addition: 18
    customers -= 3 // Example of subtraction: 15
    customers *= 2 // Example of multiplication: 30
    customers /= 3 // Example of division: 10

    println("Customers : $customers")
    // Output: Customers : 10
}



/*==========================
SECTION 2 : Basic types
============================
- Integers
    Whole numbers (e.g., 1, 2020).
        Types: Byte, Short, Int, Long
        Example:
        val year: Int = 2020

- Unsigned Integers
    Whole numbers that cannot be negative.
        Types: UByte, UShort, UInt, ULong
        Example:
        val score: UInt = 100u

- Floating-Point Numbers
    Numbers with decimals (e.g., 24.5, 19.99).
        Types: Float, Double
        Example:
        val currentTemp: Float = 24.5f
        val price: Double = 19.99

- Booleans
    True or false values.
        Type: Boolean
        Example:
        val isEnabled: Boolean = true

- Characters
    A single letter, digit, or symbol (e.g., 'A', ',').
        Type: Char
        Example:
        val separator: Char = ','

- Strings
    Text made up of characters (e.g., "Hello").
        Type: String
        Example:      
        val message: String = "Hello, world!"
 */
fun basicTypes() {

    // Integer Types
    val year: Int = 2023 // Explicitly typed and initialized
    val age = 25 // Type inferred as Int
    println("Year: $year, Age: $age") 
    // Output: Year: 2023, Age: 25

    // Unsigned Integer Types
    val score: UInt = 100u // Unsigned Int
    println("Score: $score") 
    // Output: Score: 100

    // Floating-Point Numbers
    val temperature: Float = 36.6f // Float requires 'f' suffix
    val price: Double = 19.99 // Double type
    println("Temperature: $temperature, Price: $price")
    // Output: Temperature: 36.6, Price: 19.99

    // Boolean Type
    val isAvailable: Boolean = true
    println("Is Available: $isAvailable") 
    // Output: Is Available: true

    // Character Type
    val grade: Char = 'A'
    val separator: Char = ','
    println("Grade: $grade, Separator: $separator")
    // Output: Grade: A, Separator: ,

    // String Type
    val message: String = "Hello, Kotlin!"
    println("Message: $message") 
    // Output: Message: Hello, Kotlin!

    // Declaring variables without initialization
    val d: Int // Declared but not initialized
    d = 42 // Initialized later
    println("Value of d: $d") // Output: Value of d: 42

    //If you don't initialize a variable before it is read, you see an error:
    // Error Example (Uncomment to see the error)
    // val d1: Int
    // println(d1) // Error: Variable 'd1' must be initialized

}
