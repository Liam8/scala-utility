package io.github.liam8.scala.util.tool

import org.junit.Assert._
import org.junit.Test

class StopwatchTest {

  @Test
  def testElapsedTime() = {
    val stopwatch = new Stopwatch()
    assertTrue(stopwatch.elapsedTime < 1)
    Thread.sleep(1000)
    assertTrue(stopwatch.elapsedTime() - 1 < 0.1)
    println(stopwatch.elapsedTime())
  }

  @Test
  def testElapsedTimeString() = {
    val stopwatch = new Stopwatch()
    assertTrue(stopwatch.elapsedTimeString().isInstanceOf[String])
    Thread.sleep(1000)
    println(stopwatch.elapsedTimeString())
  }
}