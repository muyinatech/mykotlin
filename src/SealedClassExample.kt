import java.util.*

enum class SomeEntityType { // enum class
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object SomeEntityFactory {
    fun create(type: SomeEntityType) : SomeEntity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            SomeEntityType.EASY -> type.name
            SomeEntityType.MEDIUM -> type.getFormattedName()
            SomeEntityType.HARD -> "Hard"
            SomeEntityType.HELP -> type.getFormattedName()
        }
        return when (type) {
            SomeEntityType.EASY -> SomeEntity.Easy(id, name)
            SomeEntityType.MEDIUM -> SomeEntity.Medium(id, name)
            SomeEntityType.HARD -> SomeEntity.Hard(id, name, 2f)
            SomeEntityType.HELP -> SomeEntity.Help
        }
    }
}

sealed class SomeEntity {
    object Help : SomeEntity() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): SomeEntity() {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val id: String, val name: String): SomeEntity()
    data class Hard(val id: String, val name: String, val multiplier: Float): SomeEntity()
}

// Extension methods, add extended method to Medium class
fun SomeEntity.Medium.printInfo() {
    println("Medium class: $id")
}

// Extension property, add extend property to Medium class
val SomeEntity.Medium.info: String
    get() =  "some info"

fun main() {
    val entity: SomeEntity = SomeEntityFactory.create(SomeEntityType.EASY)
    val msg = when(entity) {
        SomeEntity.Help -> "Help class"
        is SomeEntity.Easy -> "Easy class"
        is SomeEntity.Medium -> "Medium class"
        is SomeEntity.Hard -> "Hard class"
    }
    println(msg)

    val entity1 = SomeEntityFactory.create(SomeEntityType.EASY)
    val entity2 = SomeEntity.Easy("id", "name")
    val entity3 = entity2.copy() // data classes provide a copy constructor
    val entity4 = entity2.copy(name = "new name") // copy and change a property value
    if (entity2 == entity3) { // value comparison
        println("they are equal")
    } else {
        println("they are not equal")
    }

    if (entity2 === entity3) { // referential comparison
        println("they are equal")
    } else {
        println("they are not equal")
    }

    val entity5 = SomeEntity.Medium("id", "name").printInfo()
    val entity6 = SomeEntityFactory.create(SomeEntityType.MEDIUM)
    if (entity6 is SomeEntity.Medium) {
        entity6.printInfo()
        println(entity6.info)
    }
}