package org.example.cojed

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform