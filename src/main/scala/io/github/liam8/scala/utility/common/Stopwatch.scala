package io.github.liam8.scala.utility.common

/**
  * Stopwatch for logging elapsed time
  */
object Stopwatch {

  private final val start = System.currentTimeMillis()

  def elapsedTime(): Double = {
    val end = System.currentTimeMillis()
    (end - start) / 1000.0
  }

}