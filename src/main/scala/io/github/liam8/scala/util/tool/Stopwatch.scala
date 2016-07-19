package io.github.liam8.scala.util.tool

import java.util.concurrent.TimeUnit

/**
  * Stopwatch for logging elapsed time
  */
class Stopwatch {

  private final val start = System.currentTimeMillis()

  def elapsedTime(): Long = {
    val end = System.currentTimeMillis()
    end - start
  }

  def elapsedTimeString(): String = {
    val millis: Long = elapsedTime()
    val hours: Long = TimeUnit.MILLISECONDS.toHours(millis)
    val minutes: Long = TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(hours)
    val seconds: Long = TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
    val milliseconds: Long = millis - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(millis))
    f"$hours%02d:$minutes%02d:$seconds%02d.$milliseconds%03d"
  }
}