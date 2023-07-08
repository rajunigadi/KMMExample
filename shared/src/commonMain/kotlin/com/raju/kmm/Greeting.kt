package com.raju.kmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Guess what it is! > ${platform.name.reversed()}!"
    }
}