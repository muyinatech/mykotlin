import java.util.*

enum class AnotherEntityType { // enum class
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object AnotherEntityFactory {
    fun create(type: AnotherEntityType) : AnotherEntity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            AnotherEntityType.EASY -> type.name
            AnotherEntityType.MEDIUM -> type.getFormattedName()
            AnotherEntityType.HARD -> "Hard"
        }
        return AnotherEntity(id, name)
    }
}

class AnotherEntity (private val id: String, private val name: String) { // factory class
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main() {
    var entity = AnotherEntityFactory.create(AnotherEntityType.EASY)
    println(entity)

    entity = AnotherEntityFactory.create(AnotherEntityType.MEDIUM)
    println(entity)
}