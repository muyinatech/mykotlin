interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person)
    fun printInfo2(person: Person) { // default interface method
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}

// use abstract keyword if class does not implement all the interface methods
// classes, properties in Kotlin a final by default, so you need to use the open keyword in order to extend them
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String // override property
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        println("basicInfoProvider")
        person.printInfo()
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.printInfo2(Person())
    checkTypes(provider)

    val provider2 = FancyInfoProvider()
    provider2.printInfo2(Person())

    // object expression used to create an anonymous inner class
    val provider3 = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"

        override fun printInfo(person: Person) {
            println("overridden")
        }

        fun getSessionId() = "id"
    }
    provider3.printInfo(Person())
    provider3.printInfo2(Person())
    provider3.getSessionId()
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("is a sessionInfoProvider")
        //(infoProvider as SessionInfoProvider).getSessionId() // cast as SessionInfoProvider
        infoProvider.getSessionId() // smart casting
    } else {
        println("is not a sessionInfoProvider")
    }
}