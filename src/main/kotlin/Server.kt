package org.example

class Server {
    //private val logger: Logger = ServiceLocator.get("logger")

    private val logger: Logger = ReifiedServiceLocator.get()

    fun shutdown() {
        logger.log("Shutting down...")
    }
}
