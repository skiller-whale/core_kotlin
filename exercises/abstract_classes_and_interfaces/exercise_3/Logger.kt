package logger

import user.*

public interface Logger {
    fun log(recipient: User): Unit
}
