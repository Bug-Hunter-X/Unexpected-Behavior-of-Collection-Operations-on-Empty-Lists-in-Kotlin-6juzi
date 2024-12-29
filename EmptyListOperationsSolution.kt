fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }.filter { it > 5 }
    println(result) // Output: [6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }.filter { it > 5 }
    println(emptyResult) // Output: []

    // Solution: Check for emptiness before performing operations
    if (emptyList.isNotEmpty()) {
        val processedEmptyList = emptyList.map { it * 2 }.filter { it > 5 }
        println(processedEmptyList)
    } else {
        println("List is empty, skipping operations")
    }
    
    //Alternative solution using the orEmpty operator
    val safeResult = emptyList.map { it * 2 }.filter { it > 5 }.orEmpty() //Returns an empty list safely
    println(safeResult)
} 