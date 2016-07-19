package io.github.liam8.scala.util.tool

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/**
  * functions about array
  */
object ArrayHelper {

  def randomArray(length: Int, max: Int): Array[Int] = {
    val b = ArrayBuffer[Int]()
    for (i <- 1 to length) {
      b += Random.nextInt(max)
    }
    b.toArray
  }

}
