package org.example.exercises;

import static org.junit.Assert.*;

import org.junit.Test;
import org.example.exercises.FizzBuzz;

public class FizzBuzzTest {

  @Test
  public void testToString() {
    FizzBuzz testFizzBuzz = new FizzBuzz();
    assertEquals("2", testFizzBuzz.fizzBuzz(2));
  }


  @Test
  public void testFizz() {
      FizzBuzz testFizzBuzz = new FizzBuzz();
      assertEquals("Fizz", testFizzBuzz.fizzBuzz(9));
  }

  @Test
  public void testBuzz() {
    FizzBuzz testFizzBuzz = new FizzBuzz();
    assertEquals("Buzz", testFizzBuzz.fizzBuzz(25));
  }

  @Test
  public void testFizzBuzz() {
    FizzBuzz testFizzBuzz = new FizzBuzz();
    assertEquals("FizzBuzz", testFizzBuzz.fizzBuzz(15));
  }



}
