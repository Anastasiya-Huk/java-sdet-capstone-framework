package org.example.task_1139738.exceptions;

/*
Array out of bounds
 */

public class Exception2 {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};

    try {
      System.out.println(numbers[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index");
    }
  }
}
