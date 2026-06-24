package org.example.task_1139738.collections;

/*
List
 */

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Anna");
    names.add("John");
    names.add("Kate");
    names.add("Mike");
    for (String name : names) {
      System.out.println(name);
    }
  }
}
