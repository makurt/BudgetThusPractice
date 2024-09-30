package de.budget.thus.core.logger

import co.touchlab.kermit.Logger

interface UbLogger {
  fun log(logLevel: LogLevel, message: String)
  fun log(throwable: Throwable)
}

internal class UbLoggerImpl : UbLogger {

  override fun log(
    logLevel: LogLevel,
    message: String
  ) {
    when (logLevel) {
      LogLevel.DEBUG -> Logger.d { message }
      LogLevel.WARN -> Logger.d { message }
      LogLevel.ERROR -> Logger.d { message }
    }
  }

  override fun log(throwable: Throwable) {
    Logger.e(throwable) { throwable.message ?: "Unknown Message for $throwable" }
  }
}