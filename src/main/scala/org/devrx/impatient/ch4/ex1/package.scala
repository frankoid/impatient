package org.devrx.impatient.ch4

import scala.util.Random

package object ex1 {
  def randomInts(n: Int): Array[Int] = {
    val result = new Array[Int](n)
    for (i <- 0 until n) {
      result(i) = Random.nextInt(n)
    }
    result
  }
}
