package servers

import user.*

public interface Server {
    fun dispatch(recipient: User, emailBody: String): Unit
}

public class HostServer(
    private val host: String
) : Server {
    // Not a real server, this is just designed to mimic one
    override fun dispatch(recipient: User, emailBody: String): Unit {
        print("Host: ${host}\nSending mail to ${recipient.name}")
        try { (0..8).forEach { print("."); Thread.sleep(40) }
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
            println("Thread interrupted")
        }
        println("complete.")
    }
}
