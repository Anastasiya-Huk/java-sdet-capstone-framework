package org.example.task_1139737;

/*
Compare Two Strings
 */

import java.util.Scanner;

public class StringValidation3 {

  static void main() {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter field 1: ");
    String field1 = console.nextLine();

    System.out.print("Enter field 2: ");
    String field2 = console.nextLine();

    if (field1.equals(field2)) {
      System.out.print("Strings are equal");
    } else {
      System.out.print("Strings are not equal");
    }
  }
}
