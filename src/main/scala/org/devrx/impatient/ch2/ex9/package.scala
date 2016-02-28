package org.devrx.impatient.ch2

package object ex9 {
  def unicodeProduct(s: String): BigInt = s match {
    case "" => 1
    case _ => BigInt(s.head) * unicodeProduct(s.tail)
  }
}
