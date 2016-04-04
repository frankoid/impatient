package org.devrx.impatient.ch4

package object ex2 {
  def swapAdjacentInPlace[T](a: Array[T]): Unit = {
    for (i <- 1.until(a.length, 2)) {
      val first = a(i - 1)
      a(i - 1) = a(i)
      a(i) = first
    }
  }
}
