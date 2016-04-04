package org.devrx.impatient.ch6.ex6

import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.prop.TableDrivenPropertyChecks._

class SuitSpec extends FlatSpec with Matchers {
  val suits = Table(
    ("suit", "symbol", "isRed"),
    (Suit.Clubs, "♣", false),
    (Suit.Diamonds, "♦", true),
    (Suit.Hearts, "♥", true),
    (Suit.Spades, "♠", false)
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
