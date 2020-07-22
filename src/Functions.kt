// top-level functions
fun getGreeting(): String {
    return "Hello Kotlin"
}
fun getGreeting2() = "Hello Kotlin" // type inference

fun getGreeting3(): String? { // allows you to return null
    return null
}

// fun sayHello() :Unit {
fun sayHello() { // same as above, function does not return a value
    getGreeting()
}

fun sayHello2(itemToGreet: String) {
    val msg = "Hello $itemToGreet" // String templates
    println(msg)
}

fun sayHello3(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    println(getGreeting())
    println(getGreeting2())
    println(getGreeting3())
    sayHello()
    sayHello2("Kotlin")
    sayHello3("Hello","World")
}