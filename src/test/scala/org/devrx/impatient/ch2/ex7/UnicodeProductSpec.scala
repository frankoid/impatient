package org.devrx.impatient.ch2.ex7

import org.scalatest._

class UnicodeProductSpec extends FlatSpec with Matchers {
  "unicodeProduct" should "return 9415087488 given \"Hello\"" in {
    unicodeProduct("Hello") should be (9415087488L)
  }

  "unicodeProduct" should "handle results too large to fit in a Long" in {
    unicodeProduct("A reasonably long string") should be (BigInt("101961971686794990593895164169470575902720000000"))
  }
}
