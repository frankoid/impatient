package org.devrx.impatient.ch2

package object ex1 {
  def signum[T](n: T)(implicit numeric: scala.math.Numeric[T]): Int = {
    import numeric._

    if (gt(n, zero)) 1
    else if (lt(n, zero)) -1
    else 0
  }
}
