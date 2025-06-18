package org.example

object ReifiedServiceLocator {
    private val services = mutableMapOf<Class<*>, Any>()

    internal inline fun <reified T> get(): T {
        return services[T::class.java] as? T
            ?: throw IllegalArgumentException("Service not found: ${T::class.java}")
    }

    internal inline fun <reified T> set(instance: T) {
        services[T::class.java] = instance as Any
    }
}
