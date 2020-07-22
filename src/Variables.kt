val name: String = "Tom" // top-level variable
var temp: String? = null // allowed to assign non-null
//val temp2: String = null // not allowed, types are non-null

val firstName = "Nigel" // type inference

fun main() {
    if (name != null) {
        println(name)
    } else {
        println("Hi")
    }

    val greetingToPrint = if (temp != null) temp else "Hi"
    println(greetingToPrint)

    //name = "John" // cannot reassign

    var name2: String = "Fred"
    name2 = "Bill"
    println(name2)

    temp = "apple"

    // firstName = null // typed as String, non-null not allowed

    when (temp) { // equivalent of switch statement in Java
        null -> println("Hi")
        else -> println(temp)
    }

    val greetingToPrint2 =  when (temp) {
        null -> "Hi"
        else -> temp
    }
    println(greetingToPrint2)

}