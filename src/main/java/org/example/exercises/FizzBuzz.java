package org.example.exercises;



public class FizzBuzz {

  public String fizzBuzz(int number) {
    String result = "";
    if (number % 3 == 0) {
      result = "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(number);
    }
    return result;
  }

}
