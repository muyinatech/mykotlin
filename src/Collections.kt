fun main() {
    val items = arrayOf("Apple", "Banana", "Kiwi")
    println(items.size)

    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Hey!! I am array Example"+numbers[2])

    // MutableList & ImmutableList
    val numbersCollection: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
    val readOnlyView: List<Int> = numbersCollection                  // immutable list
    println("my mutable list--"+numbersCollection)        // prints "[1, 2, 3]"
    numbersCollection.add(4)
    println("my mutable list after addition --"+numbersCollection)        // prints "[1, 2, 3, 4]"
    println(readOnlyView)
    // readOnlyView.clear()    // ⇒ does not compile

    val list = listOf(1, 2, 3, 4)
    println("First Element of our list----"+list.first())
    println("Last Element of our list----"+list.last())
    println("Even Numbers of our List----"+list.
    filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are"+strings)
}