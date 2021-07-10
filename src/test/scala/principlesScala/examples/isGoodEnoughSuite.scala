package principlesScala.examples

import org.junit.runner.RunWith
import isGoodEnough._

class isGoodEnoughSuite extends munit.FunSuite:

  test("calculate square of different numbers") {
    for (i <- Array(0.001,0.1e-20,1.0e20)) {
      val result = sqrt(i)
      println("Result with square of " + i + " is: " + result)
    }
  }
