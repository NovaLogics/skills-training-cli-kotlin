fun main() {
    val number2word = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}