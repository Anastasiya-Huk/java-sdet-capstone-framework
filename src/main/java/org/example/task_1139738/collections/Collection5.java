package org.example.task_1139738.collections;

/*
Set
 */

import java.util.HashSet;
import java.util.Set;

public class Collection5 {

  public static void main(String[] args) {
    Set<String> cities = new HashSet<>();
    cities.add("Warsaw");
    cities.add("Berlin");
    cities.add("Warsaw");
    cities.add("Paris");
    cities.add("Berlin");
    System.out.println(cities);
  }
}
