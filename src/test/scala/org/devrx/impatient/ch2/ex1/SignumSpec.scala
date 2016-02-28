package org.devrx.impatient.ch2.ex1

import org.scalatest._

class SignumSpec extends FlatSpec with Matchers {
  "signum" should "return 1 for positive integers" in {
    signum(20) should be (1)
  }

  it should "return -1 for negative integers" in {
    signum(-42) should be (-1)
  }

  it should "return 0 for zero" in {
    signum(0) should be (0)
  }
}
