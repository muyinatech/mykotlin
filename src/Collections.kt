fun main() {
    val items = arrayOf("Apple", "Banana", "Kiwi")
    println(items.size)

    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Hey!! I am array Example"+numbers[2])

    // classic for loop
    for (number in numbers) {
        println(number)
    }

    // forEach
    numbers.forEach {
        println(it)
    }

    // forEach with named iterator
    numbers.forEach {number ->
        println(number)
    }

    // forEachIndexed
    numbers.forEachIndexed { index, number ->
        println("$number is at $index")
    }

    // MutableList & ImmutableList
    val numbersCollection: MutableList<Int> = mutableListOf(1, 2, 3) // mutable List
    val readOnlyView: List<Int> = numbersCollection                  // immutable list
    println("my mutable list--"+numbersCollection)        // prints "[1, 2, 3]"
    numbersCollection.add(4)
    println("my mutable list after addition --"+numbersCollection)        // prints "[1, 2, 3, 4]"
    println(readOnlyView)
    // readOnlyView.clear()    // ⇒ does not compile

    // List
    val list = listOf(1, 2, 3, 4) // immutable by default
    println("Element at index 2 ----"+list[2])
    println("First Element of our list----"+list.first())
    println("Last Element of our list----"+list.last())
    println("Even Numbers of our List----"+list.filter { it % 2 == 0 })   // returns [2, 4]
    list.forEach { item ->
        println(item)
    }

    val list2 = mutableListOf("A", "B", "C")
    list2.add("E")
    list2.forEach { item ->
        println(item)
    }

    // Map
    val map = mapOf( 1 to "a", 2 to "b", "3" to "c")
    map.forEach { (key, value) -> println("$key -> $value") }
    val map2 = mutableMapOf( 1 to "a", 2 to "b", "3" to "c")
    map2.put(4, "d")

    // HashMap
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    // HashSet
    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are"+strings)
}