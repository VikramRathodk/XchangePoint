package org.devvikram.xchangepoint

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform