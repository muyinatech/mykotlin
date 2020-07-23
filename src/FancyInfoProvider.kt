class FancyInfoProvider : BasicInfoProvider() { // inheritance
    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo2(person: Person) {
        super.printInfo2(person)
        println("FancyInfo")
    }
}