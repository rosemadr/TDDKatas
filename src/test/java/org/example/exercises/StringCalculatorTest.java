package org.example.exercises;

import static org.junit.Assert.*;

import org.junit.Test;
import org.example.exercises.StringCalculator;

public class StringCalculatorTest {

  @Test
  public void testEmptyStrings() {
    StringCalculator stringCalc = new StringCalculator();
    assertEquals(0, stringCalc.add(""));
  }

  @Test
  public void testOneNumber() {
    StringCalculator stringCalc = new StringCalculator();
    assertEquals(6000, stringCalc.add("6000"));
  }

  @Test
  public void testTwoNumbers() {
    StringCalculator stringCalc = new StringCalculator();
    assertEquals(18, stringCalc.add("6,12"));
  }

  @Test
  public void testMultipleArguments() {
    StringCalculator stringCalc = new StringCalculator();
    assertEquals(28, stringCalc.add("1,2,3,4,5", "0", "4", "4,5"));
  }

  @Test
  public void testHandleNewlineSeparators() {
    StringCalculator stringCalc = new StringCalculator();
    assertEquals(10, stringCalc.add("1\n2\n3\n4"));
  }

  @Test
  public void testSeparatorAtEndThrowsException() {
    StringCalculator stringCalc = new StringCalculator();
    try {
      stringCalc.add("1,");
      fail("Expected an exception to be thrown");
    } catch (IllegalArgumentException e) {
      assertEquals("Number expected but EOF found", e.getMessage());
    }
  }
}