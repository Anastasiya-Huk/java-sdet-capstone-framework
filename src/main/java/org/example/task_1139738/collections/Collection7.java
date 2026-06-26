package org.example.task_1139738.collections;

/*
Map and get(key)
 */

import java.util.HashMap;
import java.util.Map;

public class Collection7 {

  public static void main(String[] args) {
    Map<Integer, String> students = new HashMap<>();
    students.put(1, "Anna");
    students.put(2, "John");
    students.put(3, "Kate");
    System.out.println(students.get(3));
  }
}
