package org.devrx.impatient.ch6.ex4

class Point (val x: Int, val y: Int) {
  override def toString = "Point[" + x + ", " + y + "]"
}

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}