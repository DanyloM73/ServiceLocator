package org.example

fun main() {
    ServiceLocator.set("logger", Logger())

    val server = Server()
    server.shutdown()
    println("Bye!")
}
