package org.devrx.impatient.ch6.ex6

object Suit extends Enumeration {
  val Clubs = Value("♣")
  val Diamonds = Value("♦")
  val Hearts = Value("♥")
  val Spades = Value("♠")

  def isRed(suit: Suit.Value) = {
    if (suit == Diamonds || suit == Hearts)
      true
    else
      false
  }
}
