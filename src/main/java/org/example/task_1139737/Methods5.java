package org.example.task_1139737;

/*
Parity check
 */

public class Methods5 {

  public static boolean isEven(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(isEven(4));
    System.out.println(isEven(7));
  }
}
