interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String) { // factory class
    companion object : IdProvider{
        override fun getId(): String {
            return "123"
        }
        const val id = "id"
        fun create() = Entity(getId())
    }
}

fun main() {
    val entity = Entity.create()
    println(Entity.id)
}