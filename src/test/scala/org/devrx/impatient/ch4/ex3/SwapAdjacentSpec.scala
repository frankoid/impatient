package org.devrx.impatient.ch4.ex3

import org.scalatest._

class SwapAdjacentSpec extends FlatSpec with Matchers {
  "swapAdjacent" should "swap adjacent array elements" in {
    swapAdjacent(Array(1, 2, 3, 4, 5)) should be (Array(2, 1, 4, 3, 5))
  }

  it should "handle empty arrays" in {
    swapAdjacent(Array()) should be (Array())
  }

  it should "not mutate its argument" in {
    val a = Array(1, 2, 3, 4, 5)
    swapAdjacent(a)
    a should be (Array(1, 2, 3, 4, 5))
  }
}
