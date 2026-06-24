package org.example.task_1139738.collections;

/*
List and even numbers
 */

import java.util.ArrayList;
import java.util.List;

public class Collection3 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(7);
    numbers.add(10);
    numbers.add(15);
    numbers.add(8);
    numbers.add(9);

    int count = 0;

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0) {
        count += 1;
      }
    }
    System.out.println(count);
  }
}
