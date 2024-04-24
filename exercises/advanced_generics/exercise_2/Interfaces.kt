package data.interfaces

interface Encodable<T> {
    fun encode(): String
}

interface Decodable<out T> {
    fun decode(input: String): T
}

interface Serializable<T> : Encodable<T>, Decodable<T>
