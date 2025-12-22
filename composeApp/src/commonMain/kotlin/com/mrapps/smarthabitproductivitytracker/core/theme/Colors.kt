package com.mrapps.smarthabitproductivitytracker.core.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Light Theme Colors
val LightPrimary = Color(0xFF280137)
val LightSecondary = Color(0xFFF9F4FB)
val LightTextColor = Color(0xFF280137)
val LightAccent= Color(color = 0xFF02000F)


// Dark Theme Colors
val DarkPrimary = Color(0xFF280137)
val DarkSecondary = Color(0xFFF9F4FB)
val DarkTextColor = Color(0xFFF9F4FB)
val DarkAccent= Color(color = 0xFF02000F)
internal val LightColorScheme = lightColorScheme(
    primary = LightPrimary,
    background =LightSecondary,
    onBackground = LightAccent,
    surface = LightSecondary,
    onSurface = LightPrimary,
    secondary = LightSecondary,
    onSecondary = LightTextColor
)

internal val DarkColorScheme = darkColorScheme(
    primary = DarkPrimary,
    background = DarkPrimary,
    onBackground = DarkAccent,
    surface = DarkPrimary,
    onSurface = DarkSecondary,
    secondary = DarkSecondary,
    onSecondary = DarkTextColor
)