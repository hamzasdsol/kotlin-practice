package prep.kotlin_prep

fun main() {

}

data class MessageBody(var text: String)

class Message(message: String, signature: String) {
    var body: MessageBody = MessageBody(message + "\n" + signature)
}