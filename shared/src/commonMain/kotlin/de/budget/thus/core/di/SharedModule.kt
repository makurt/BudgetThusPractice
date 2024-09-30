package de.budget.thus.core.di

import de.budget.thus.core.logger.UbLogger
import de.budget.thus.core.logger.UbLoggerImpl
import org.koin.dsl.bind
import org.koin.dsl.module

fun sharedModule() = module {
  factory { UbLoggerImpl() } bind UbLogger::class
}