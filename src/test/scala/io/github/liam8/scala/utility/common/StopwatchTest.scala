package io.github.liam8.scala.utility.common

import org.junit.Assert._
import org.junit.Test

class StopwatchTest {

  @Test
  def testElapsedTime() = {
    val stopwatch = new Stopwatch()
    assertTrue(stopwatch.elapsedTime < 1)
    Thread.sleep(1000)
    assertTrue(stopwatch.elapsedTime() - 1 < 0.1)
  }

}