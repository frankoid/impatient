package org.devrx.impatient.ch2.ex9

import org.devrx.impatient.ch2.ex6.AbstractUnicodeProductSpec

class UnicodeProductSpec extends AbstractUnicodeProductSpec {
  override def functionToTest(s: String): BigInt = {
    unicodeProduct(s)
  }
}
