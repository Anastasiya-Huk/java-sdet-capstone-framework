package org.example.task_1139738.collections;

/*
List and max number
 */

import java.util.ArrayList;
import java.util.List;

public class Collection2 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(12);
    numbers.add(3);
    numbers.add(20);
    numbers.add(8);

    int maxNumber = numbers.get(0);
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) > maxNumber) {
        maxNumber = numbers.get(i);
      }
    }
    System.out.println(maxNumber);
  }
}
