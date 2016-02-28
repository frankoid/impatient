package org.devrx.impatient.ch2.ex6

import org.scalatest._

abstract class AbstractUnicodeProductSpec extends FlatSpec with Matchers {
  def functionToTest(s: String): BigInt

  "unicodeProduct" should "return 9415087488 given \"Hello\"" in {
    functionToTest("Hello") should be (9415087488L)
  }

  "unicodeProduct" should "handle results too large to fit in a Long" in {
    functionToTest("A reasonably long string") should be (BigInt("101961971686794990593895164169470575902720000000"))
  }
}

class UnicodeProductSpec extends AbstractUnicodeProductSpec {
  override def functionToTest(s: String): BigInt = {
    unicodeProduct(s)
  }
}
