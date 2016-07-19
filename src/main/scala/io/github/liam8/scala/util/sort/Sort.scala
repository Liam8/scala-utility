package io.github.liam8.scala.util.sort

import scala.math.Ordered

/**
  * Base class of sort algorithms
  *
  */
abstract class Sort[A] {

  def sort(a: Array[Ordered[A]]): Unit

  /**
    * exchange element with index i and j
    */
  protected def exchange(a: Array[Ordered[A]], i: Int, j: Int) = {
    val tmp = a(i)
    a(i) = a(j)
    a(j) = tmp
  }

  /**
    * print the Array
    */
  def show(a: Array[Ordered[A]]) = {
    println(a.deep.mkString("\n"))
  }

}
