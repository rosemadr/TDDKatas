package org.example.exercises;

import static org.junit.Assert.*;

import org.junit.Test;
import org.example.exercises.FizzBuzz;

public class FizzBuzzTest {

    @Test
    public void testfizzBuzz() {
      FizzBuzz testFizzBuzz = new FizzBuzz();
      assertEquals("Three", testFizzBuzz.fizzBuzz(3));
  }

}
