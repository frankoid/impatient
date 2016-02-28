package org.devrx.impatient.ch2

package object ex6 {
  def unicodeProduct(s: String): BigInt = {
    var product: BigInt = 1
    for (c <- s) product = product * BigInt(c)
    product
  }
}
