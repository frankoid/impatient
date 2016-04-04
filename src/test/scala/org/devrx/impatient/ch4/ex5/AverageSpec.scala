package org.devrx.impatient.ch4.ex5

import org.scalatest._

class AverageSpec extends FlatSpec with Matchers {
  "average" should "return 5.0 for (4.0, 6.0)" in {
    average(Array(4.0, 6.0)) should be (5.0)
  }
}
