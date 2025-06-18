package org.example

class Server {
    private val logger: Logger = ServiceLocator.get("logger")

    fun shutdown() {
        logger.log("Shutting down...")
    }
}

