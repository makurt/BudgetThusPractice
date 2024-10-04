package de.budget.thus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
