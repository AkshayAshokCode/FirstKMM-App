package com.akshayashokcode.firstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform