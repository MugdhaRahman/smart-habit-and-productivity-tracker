package com.mrapps.smarthabitproductivitytracker.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

//val mainModules = module {
//    viewModel { HomeViewModel() }
//    viewModel { params -> DetailsViewModel(id = params.get()) }
//}

fun initializeKoin(
    config: (KoinApplication.() -> Unit)? = null,
) {
    startKoin {
        config?.invoke(this)
        modules(navigationModule)
    }
}