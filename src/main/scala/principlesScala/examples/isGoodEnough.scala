package principlesScala.examples

object isGoodEnough {

  /**
   * This function get the square of a number like a example
   *
   * @param xs A list of natural numbers
   * @return The sum of all elements in `xs`
   */

  def abs(x:Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) = abs(guess * guess -x) < 0.001

  def improve(guess: Double, x: Double) =(guess + x / guess) / 2

  sqrtIter(1.0, x)
  }
}
