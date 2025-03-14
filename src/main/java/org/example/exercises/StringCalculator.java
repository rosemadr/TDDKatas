package org.example.exercises;

import java.util.*;

public class StringCalculator {

  public int add(String... strings) {
    int sum = 0;
    for (String string : strings) {
      sum += sumIndividualNumbers(string);
    }
    return sum;
  }

  public int sumIndividualNumbers(String string) {
    if (string.isEmpty()) {
      return 0;
    } else if (string.)

    else if (string.contains(",")) {
      String[] splitString = string.split(",");
      return handleCommas(string);
    } else if (string.contains("\n")) {
      return handleNewlines(string);
    } else {
      return Integer.parseInt(string);
    }
  }

  public int handleCommas(String string) {
    int sum = 0;
    String[] splitString = string.split(",");
    for (String s : splitString) {
      sum += Integer.parseInt(s);
    }
    return sum;
  }

  public int handleNewlines(String string) {
    int sum = 0;
    String[] splitString = string.split("\n");
    for (String s : splitString) {
      sum += Integer.parseInt(s);
    }
    return sum;
  }

}
