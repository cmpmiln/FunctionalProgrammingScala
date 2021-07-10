package principlesScala.examples

import org.junit.runner.RunWith
import Lists._

/**
 * This class implements a munit test suite for the methods in object
 * `Lists` that need to be implemented as part of this assignment. A test
 * suite is simply a collection of individual tests for some specific
 * component of a program.
 *
 * To run this test suite, start "sbt" then run the "test" command.
 */

class ListsSuite extends munit.FunSuite:

  test("sum of a few numbers return 3") {
    assertEquals(sum(List(1,2,0)),3)
  }

  test("max of a few numbers return 7") {
    assertEquals(max(List(3, 7, 2)), 7)
  }

  test("max with negative numbers return 0") {
    assertEquals(max(List(0,-5,-10)),0)
  }

  test("max in a empty list return exception") {
    intercept[NoSuchElementException] {
      max(List())}
  }

  test("sum a empty list return exception") {
    intercept[NoSuchElementException] {
      sum(List())}
  }
