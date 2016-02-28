package org.devrx.impatient.ch2

package object ex7 {
  def unicodeProduct(s: String)(implicit b: scala.math.Numeric[BigInt]): BigInt = {
    // Not sure that this is the solution that the book is looking for, but it does
    // calculate the product without using a for loop
    s.map(BigInt(_)).product
  }
}
