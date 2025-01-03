/* Early Returns in Kotlin

- Early Return:
    * You can exit a function early using the return keyword.
    * This is useful to stop further code execution if certain conditions are met.

- Improves Readability:
    * Using early returns simplifies complex functions and prevents deeply nested code.

- Conditional Early Return:
    * Combine if statements with return to exit the function when a condition is satisfied.

Notes:
    * Early returns prevent unnecessary processing and improve performance.
    * Using early returns can make your code simpler and more readable by avoiding deeply nested conditions.
 */


 val registeredUsernames = mutableListOf("john_doe", "jane_smith")
 val registeredEmails = mutableListOf("john@example.com", "jane@example.com")
 
 fun registerUser(username: String, email: String): String {
     // Early return if the username is already taken
     if (username in registeredUsernames) {
         return "Username already taken. Please choose a different username."
     }
 
     // Early return if the email is already registered
     if (email in registeredEmails) {
         return "Email already registered. Please use a different email."
     }
 
     // Proceed with the registration if the username and email are not taken
     registeredUsernames.add(username)
     registeredEmails.add(email)
 
     return "User registered successfully: $username"
 }
 
 fun main() {
     println(registerUser("john_doe", "newjohn@example.com"))  
     // Output: Username already taken. Please choose a different username.
     
     println(registerUser("new_user", "newuser@example.com"))
     // Output: User registered successfully: new_user
 }
 