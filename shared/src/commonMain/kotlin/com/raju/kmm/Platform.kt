package com.raju.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform