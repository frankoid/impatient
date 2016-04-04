package org.devrx.impatient.ch4

package object ex4 {
  def positiveThenZeroOrNegative(a: Array[Int]): Array[Int] = {
    a.filter(_ > 0) ++ a.filter(_ <= 0)
  }
}
