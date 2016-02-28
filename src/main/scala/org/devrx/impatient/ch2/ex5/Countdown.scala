package org.devrx.impatient.ch2.ex5

trait Output {
  def println(message: Any) = Console.println(message)
}

class Countdown extends Output {
  def countdown(n: Int) {
    for (i <- n.to(0, -1)) println(i)
  }
}
