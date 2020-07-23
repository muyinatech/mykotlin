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

fun sayHello4(greeting: String, vararg itemsToGreet: String) { // vararg
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "World") = println("$greeting $name") // default values

fun main() {
    println(getGreeting())
    println(getGreeting2())
    println(getGreeting3())
    sayHello()
    sayHello2("Kotlin")
    sayHello3("Hello", "World")
    sayHello4("Hello")
    sayHello4("Hello", "Jill", "Bob")

    val names = arrayOf("Mark", "John")
    // sayHello4("Hello", names) // type mismatch
    sayHello4("Hello", *names) // use spread operator
    greetPerson(name = "Fred", greeting = "Hi") // named arguments
    greetPerson(name="Daniel")
    greetPerson(greeting="Howdy")
    greetPerson()
}