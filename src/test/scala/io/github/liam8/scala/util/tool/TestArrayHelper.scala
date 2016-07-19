package io.github.liam8.scala.util.tool

import org.junit.Assert._
import org.junit.Test

class TestArrayHelper {

  @Test
  def testRandomArray(): Unit = {
    val arr = ArrayHelper.randomArray(10, 100)
    assertEquals(10, arr.length)
    assert(arr.max < 100)
  }
}
