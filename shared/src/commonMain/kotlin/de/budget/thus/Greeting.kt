package de.budget.thus

class Greeting {

    private val platform = getPlatform()

    fun greet() = "Hello, ${platform.name}!"
}
