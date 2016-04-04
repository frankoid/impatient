package org.devrx.impatient.ch4.ex4

import org.scalatest._

class PositiveThenZeroOrNegativeSpec extends FlatSpec with Matchers {
  "positiveThenZeroOrNegative" should "return positive elements then zero or negative elements" in {
    positiveThenZeroOrNegative(Array(23, 42, -1, 0, 52, -24, 2)) should be (Array(23, 42, 52, 2, -1, 0, -24))
  }

  it should "handle empty arrays" in {
    positiveThenZeroOrNegative(Array()) should be (Array())
  }

  it should "not mutate its argument" in {
    val a = Array(1, 2, 3, 4, 5)
    positiveThenZeroOrNegative(a)
    a should be (Array(1, 2, 3, 4, 5))
  }
}
