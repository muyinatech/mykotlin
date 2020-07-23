fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
//        if(predicate(it)) { does not work as predicate function is nullable
//            println(it)
//        }

        if(predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("K")
}

fun getPrintPredicate(): (String) -> Boolean { // returns a lambda
    return {it.startsWith("J")}
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript")

    printFilteredStrings(list) { // you can call the lambda function outside of the parentheses
        it.startsWith("K")
    }

    printFilteredStrings(list, predicate)
    printFilteredStrings(list, getPrintPredicate())
    printFilteredStrings(list, null)
}