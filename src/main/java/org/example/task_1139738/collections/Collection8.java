package org.example.task_1139738.collections;

/*
Map and grouping
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection8 {

  public static void main(String[] args) {
    Map<String, List<String>> departments = new HashMap<>();
    addEmployee(departments, "QA", "Anna");
    addEmployee(departments, "Developer", "John");
    addEmployee(departments, "QA", "Kate");
    addEmployee(departments, "Developer", "Mike");
    addEmployee(departments, "Manager", "Bob");

    System.out.println(departments);
  }

  public static void addEmployee(
      Map<String, List<String>> departments,
      String department,
      String employee) {
    if (departments.containsKey(department)) {
      departments.get(department).add(employee);
    } else {
      List<String> employees = new ArrayList<>();
      employees.add(employee);
      departments.put(department, employees);
    }
  }
}
