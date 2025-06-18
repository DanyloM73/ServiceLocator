package org.example

object ServiceLocator {
    private val modules = mutableMapOf<String, Any>()

    @Suppress("UNCHECKED_CAST")
    fun <T> get(name: String): T {
        return modules[name] as? T
            ?: throw IllegalArgumentException("Service not found: $name")
    }

    fun set(name: String, module: Any) {
        modules[name] = module
    }
}

