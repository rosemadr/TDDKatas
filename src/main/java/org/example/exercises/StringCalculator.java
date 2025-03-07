package org.example.exercises;

public class StringCalculator {

  public int add(String string) {
    int result = 9999;
    if (string.isEmpty()) {
      result = 0;
    } else if (string.contains(",")) {
      String[] splitString = string.split(",");
      int[] intsList;
      for (int i = 0; i < splitString.size(); i++) {
        intsList.append(Integer.parseInt(i));
      }
    }
    {
      result = Integer.parseInt(string);
    }
    return result;
  }

}
