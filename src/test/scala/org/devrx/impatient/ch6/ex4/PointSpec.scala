package org.devrx.impatient.ch6.ex4

import org.scalatest.{FlatSpec, Matchers}

class PointSpec extends FlatSpec with Matchers {
  "Point(5,3)" should "have x=5 and y=3" in {
    val point = Point(5,3)
    point.x should be (5)
    point.y should be (3)
  }
}
