package org.devrx.impatient.ch6.ex6

import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.prop.TableDrivenPropertyChecks._

class ColourSpec extends FlatSpec with Matchers {
  val colours = Table(
    ("colour", "hex", "name"),
    (Color.Red, 0xff0000, "Red"),
    (Color.Green, 0x00ff00, "Green"),
    (Color.Blue, 0x0000ff, "Blue"),
  )

  "toString" should "be the symbol for the suit" in {
    forAll(suits) { (suit: Suit.Value, symbol: String, _) =>
      suit.toString should be (symbol)
    }
  }

  "isRed" should "be true for red suits" in {
    forAll(suits) { (suit: Suit.Value, _, isRed: Boolean) =>
      Suit.isRed(suit) should be (isRed)
    }
  }
}
