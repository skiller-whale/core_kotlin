package formatters

import user.*

public interface Formatter {
    fun generateBody(recipient: User, content: String): String
}

// TODO, PART 1: define the `PlainTextFormatter` class here

public class HtmlFormatter : Formatter {
    override public fun generateBody(recipient: User, content: String): String {
        return "<div class='user-info'><p>${recipient.userId}</p><p>${recipient.email}" +
               "</p></div><div><p>Hi ${recipient.name}</p></div><div>${content}</div>"
    }
}
