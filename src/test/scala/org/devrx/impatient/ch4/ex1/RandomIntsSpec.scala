package org.devrx.impatient.ch4.ex1

import org.scalatest._

class RandomIntsSpec extends FlatSpec with Matchers {
  "randomInts" should "usually return a different result each time called" in {
    val r1 = randomInts(300)
    val r2 = randomInts(300)

    r1 should not equal r2
  }

  it should "return an array of length n" in {
    randomInts(0).length should be (0)
    randomInts(10).length should be (10)
  }
}
