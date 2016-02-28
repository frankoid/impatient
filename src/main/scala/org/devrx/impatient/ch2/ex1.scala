package org.devrx.impatient.ch2

package object ex1 {
  def signum(n: Int): Int = {
    if (n == 0) 0
    else if (n < 0) -1
    else 1
  }
}
