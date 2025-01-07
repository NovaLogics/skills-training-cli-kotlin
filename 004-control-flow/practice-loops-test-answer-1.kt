fun main() {
    useWhile()

    println()

    useDoWhile()
}

fun useWhile(){
    var pizzaSlices = 0
    // Start refactoring here

    while(pizzaSlices < 7){
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")

    }
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}



fun useDoWhile(){
    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices++
    do{
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }while(pizzaSlices < 8)

    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}