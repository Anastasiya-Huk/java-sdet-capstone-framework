package org.example.task_1139738.collections;

/*
List and removing elements
 */

import java.util.ArrayList;
import java.util.List;

public class Collection4 {

  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Pear");

    while (fruits.remove("Banana")) {
    }
    System.out.println(fruits);
  }
}
