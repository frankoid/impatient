package org.devrx.impatient.ch2.ex10

import org.scalatest._

class PowSpec extends FlatSpec with Matchers {
  "pow" should "return 256 for 2, 8" in {
    pow(2, 8) should be (256)
  }

  "pow" should "return 256 for 4, -3" in {
    pow(4, -3) should be (0.015625)
  }
}
