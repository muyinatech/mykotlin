// class Person(firstName: String, lastName: String) {
// In Kotlin class, method and properties have public visibility by default
class Person(val firstName: String = "Robert", val lastName: String = "Brown") {
    // class visibility modifiers - public, internal (public within module), private (only visible within the file it is declared)
    // property/method visibility modifiers - private, protected (within class or subclass), public

    // class property with getter & setter
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    init { // run before secondary constructor
        println("init 1")
    }
//    constructor(): this("Peter", "Parker") {
//        println("secondary constructor")
//    }

    init {
        println("init 2")
    }

//    val firstName: String = _firstName
//    val lastName: String = _lastName

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname" // elvis operator, default if null
        println("$firstName ($nickNameToPrint) $lastName")
    }

}