package servers

import user.*

public interface Server {
    public fun dispatch(host: String, recipient: User, emailBody: String): Unit
}
