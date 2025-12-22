package com.mrapps.smarthabitproductivitytracker.di

import com.mrapps.smarthabitproductivitytracker.navigation.Navigator
import com.mrapps.smarthabitproductivitytracker.navigation.Screen
import com.mrapps.smarthabitproductivitytracker.screens.HomeScreen
import com.mrapps.smarthabitproductivitytracker.screens.LandingScreen
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

@OptIn(KoinExperimentalAPI::class)
val navigationModule = module {
    single { Navigator(startDestination = Screen.Landing) }

    navigation<Screen.Landing> {
        LandingScreen(
            navigateToHome = { number ->
                get<Navigator>().navigateTo(destination = Screen.Home(id = number))
            }
        )
    }

    navigation<Screen.Home> { route ->
        HomeScreen(
            id = route.id,
            navigateBack = {
                get<Navigator>().goBack()
            }
        )
    }
}