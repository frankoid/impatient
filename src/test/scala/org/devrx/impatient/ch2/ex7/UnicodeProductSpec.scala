package org.devrx.impatient.ch2.ex7

import org.devrx.impatient.ch2.ex6.AbstractUnicodeProductSpec

class UnicodeProductSpec extends AbstractUnicodeProductSpec {
  override def functionToTest(s: String): BigInt = {
    unicodeProduct(s)
  }
}
