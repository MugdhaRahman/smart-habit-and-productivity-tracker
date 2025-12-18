package com.mrapps.smarthabitproductivitytracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform