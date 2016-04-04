package org.devrx.impatient.ch4.ex2

import org.scalatest._

class SwapAdjacentInPlaceSpec extends FlatSpec with Matchers {
  "swapAdjacentInPlace" should "swap adjacent array elements" in {
    val a = Array(1, 2, 3, 4, 5)
    swapAdjacentInPlace(a)
    a should be (Array(2, 1, 4, 3, 5))
  }
}
