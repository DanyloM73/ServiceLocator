package org.example

object ServiceLocator {
    private val services = mutableMapOf<String, Any>()

    @Suppress("UNCHECKED_CAST")
    fun <T> get(name: String): T {
        return services[name] as? T
            ?: throw IllegalArgumentException("Service not found: $name")
    }

    fun set(name: String, service: Any) {
        services[name] = service
    }
}

