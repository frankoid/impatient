package org.devrx.impatient.ch2.ex5

import org.scalatest._

trait MockOutput extends Output {
  var messages: Seq[String] = Seq()

  override def println(message: Any) = messages = messages :+ String.valueOf(message)
}

class CountdownSpec extends FlatSpec with Matchers {
  "countdown" should "print numbers from 10 to 0 when invoked with 10" in {
    val countdown = new Countdown with MockOutput
    countdown.countdown(10)
    countdown.messages should be (Seq("10","9","8","7","6","5","4","3","2","1","0"))
  }

  it should "print numbers from 2 to 0 when invoked with 2" in {
    val countdown = new Countdown with MockOutput
    countdown.countdown(2)
    countdown.messages should be (Seq("2","1","0"))
  }

  it should "print 0 when invoked with 0" in {
    val countdown = new Countdown with MockOutput
    countdown.countdown(0)
    countdown.messages should be (Seq("0"))
  }

  it should "print nothing when invoked with a negative number" in {
    val countdown = new Countdown with MockOutput
    countdown.countdown(-1)
    countdown.messages should be (Seq())
  }
}
