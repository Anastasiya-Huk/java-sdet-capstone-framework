package org.example.task_1139738.exceptions;

/*
finally
 */

public class Exception4 {

  public static void main(String[] args) {
    int c = 10;
    int d = 0;

    try {
      int result = c / d;
    } catch (ArithmeticException e) {
      System.out.println("Error: division by zero");
    } finally {
      System.out.println("=== FINALLY ===");
    }
  }
}
