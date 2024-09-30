package de.budget.thus.core.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(
  consumerDeclaration: KoinAppDeclaration = {},
) = startKoin {
  consumerDeclaration()
  modules(platformModule(),)
}

fun initKoin() = initKoin {}