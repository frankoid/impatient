package org.devrx.impatient.ch4

import scala.math.min
import scala.reflect.ClassTag

package object ex3 {
  def swapAdjacent[T:ClassTag](a: Array[T]): Array[T] = {
    val lastIndex: Int = a.length - 1
    val seq: IndexedSeq[T] = for (i <- a.indices) yield a(min(lastIndex, i + (if (i % 2 == 0) 1 else -1)))
    seq.toArray
  }
}
