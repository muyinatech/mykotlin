fun main() {
    val person = Person("Bill", "Jones")
    person.firstName
    // person.firstName = "William" // cannot change immutable
    person.lastName
    person.nickName = "BJ"
    println(person.nickName)

    val person2 = Person()
    person2.printInfo()

}