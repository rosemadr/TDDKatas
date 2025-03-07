package org.example.exercises;

public class FizzBuzz {

  public String fizzBuzz(int number) {
    String result = "";
    if (number % 3 == 0) {
      result = "Fizz";
    }
    if (number % 5 == 0) {
      result = result + "Buzz";
    } else if (result == "") {
      result = String.valueOf(number);
    }
    return result;
  }

}
