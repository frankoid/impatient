package org.devrx.impatient.ch6.ex1

import org.scalatest.{Matchers, FlatSpec}

class ConversionsSpec extends FlatSpec with Matchers {
  "inchesToCentimeters" should "return 0.0 given 0.0" in {
    Conversions.inchesToCentimeters(0.0) should be (0.0)
  }

  it should "return 2.54 given 1.0" in {
    Conversions.inchesToCentimeters(1) should be (2.54)
  }
}
