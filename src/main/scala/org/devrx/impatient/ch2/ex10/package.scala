package org.devrx.impatient.ch2

package object ex10 {
  def pow(x: Double, n: Int): Double = {
    if ((n % 2 == 0) && n > 0) {
      val y = pow(x, n / 2)
      y * y
    } else if ((n % 2 == 1) && n > 0) {
      x * pow(x, n - 1)
    } else if (n == 0) {
      1
    } else if (n < 0) {
      1 / pow(x, 0 - n)
    } else {
      throw new RuntimeException("Don't know how to handle x = " + x + ", n = " + n)
    }
  }
}
