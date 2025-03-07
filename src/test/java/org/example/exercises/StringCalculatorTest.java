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
}