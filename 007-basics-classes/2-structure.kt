/*===================================
SECTION 1 : Properties in Kotlin Classes
============================

Properties represent the characteristics of a class's object.

*/

// Declaring Properties

// [ 1 ] In the Class Header (in parentheses after class name):
class Contact(val id: Int, var email: String)

// [ 2 ] Inside the Class Body (within curly braces):
class ContactDetails(val id: Int, var email: String) {
    val category: String = "work"
}

// ----------------------------------

// Read-only Properties: Use val to declare properties that can’t be modified after object creation.
// Example:
class ContactTest1(val category: String = "work")

// Mutable Properties: Use var to allow properties to be changed.
// Example:
class ContactTest2(var email: String)

// Default Values: You can assign default values to properties.
// Example:
class ContactTest3(val id: Int, var email: String = "example@gmail.com")

// ----------------------------------

// Creating an Object
// Objects are created by declaring an instance of a class using the constructor.
val contact = Contact(1, "mary@gmail.com")

// Accessing Properties
// Use a period . to access or modify a property of an instance.
// Access property
// println(contact.email)
// Modify property
// contact.email = "jane@gmail.com"

// String Templates
// You can concatenate property values into strings using ${}
// println("Their email address is: ${contact.email}")

// =======================================================================

/*===================================
SECTION 2 : Member Functions in Kotlin
============================
*/

// Member functions define an object's behavior and are declared inside the class body. Example:
class ContactTest4(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

// To call a member function on an object, use the object instance followed by a period . and the
// function name:
fun main() {
    val contact = ContactTest4(1, "a@gmail.com")
    contact.printId() // Calls the printId function

    // Access property
    println(contact.email)
    // Modify property
    contact.email = "jane@gmail.com"

    // String Templates
    // You can concatenate property values into strings using ${}
    println("Their email address is: ${contact.email}")
}
