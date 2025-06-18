package org.example

fun main() {
    //ServiceLocator.set("logger", Logger())

    ReifiedServiceLocator.set(Logger())

    val server = Server()
    server.shutdown()
    println("Bye!")
}
