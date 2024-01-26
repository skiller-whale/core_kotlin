package user

import kotlin.random.*

public data class User (
    private val firstName: String,
    private val surname: String,
    public val email: String,
) {
    public val name get() = "$firstName $surname"
    public val userId     = generateID(10)

    private fun generateID(num: Int): String {
        val userID = StringBuilder()
        (0 until num).forEach { userID.append(Random.nextInt(0..1000)) }
        return userID.toString()
    }

    companion object {
        public val users: MutableList<User> = mutableListOf()
    }

    init { User.users.add(this) }
}
