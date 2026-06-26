package org.example.task_1139738.collections;

/*
Map
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection6 {

  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    fruits.add("apple");

    Map<String, Integer> wordcount = new HashMap<>();
    for (String fruit : fruits) {
      if (wordcount.containsKey(fruit)) {
        int count = wordcount.get(fruit);
        wordcount.put(fruit, count + 1);
      } else {
        wordcount.put(fruit, 1);
      }
    }
    System.out.println(wordcount);
  }
}
