package data.interfaces

interface Encodable<T> {
    fun encode(): String
}

interface Decodable<out T> {
    fun decode(input: String): T
}

// TODO: define a `Serializable<T>` interface
