package org.example.task_1139738.exceptions;

/*
Division by zero
 */

public class Exception1 {

  public static void main(String[] args) {
    int a = 6;
    int b = 0;

    try {
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    }
  }
}
