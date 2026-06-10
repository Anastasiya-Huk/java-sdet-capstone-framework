package org.example.task_1139738.exceptions;

/*
try-catch, throw, trows, finally
 */

public class Exception5 {

  public static void validatePassword(String password) throws Exception {
    if (password.length() < 8) {
      throw new Exception("Password is too short");
    }
  }

  public static void main(String[] args) {
    try {
      validatePassword("1234567");
    } catch (Exception e) {
      System.out.println("Password is too short");
    } finally {
      System.out.println("Validation finished");
    }
  }
}
