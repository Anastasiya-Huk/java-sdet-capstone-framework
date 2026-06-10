package org.example.task_1139738.exceptions;

/*
trow + try-catch
 */

public class Exception3 {

  public static void main(String[] args) {
    try {
      int number = checkAge(-1);
      System.out.println(number);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  public static int checkAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
    System.out.println("Age is valid");
    return age;
  }
}
