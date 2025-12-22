package com.mrapps.smarthabitproductivitytracker.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {
    @Serializable
    object Landing

    @Serializable
    data class Home(val id: Int)
}