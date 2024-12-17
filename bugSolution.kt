fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 }
    println(filteredList) // Output: [1, 3, 5]

    val list2 = listOf(1, 2, 3, 4, 5)
    val filteredList2 = list2.filter { it % 2 != 0 }
    println(filteredList2) // Output: [1, 3, 5]
}