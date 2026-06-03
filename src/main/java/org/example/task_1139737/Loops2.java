package org.example.task_1139737;

/*
Unlocking a phone
 */

import java.util.Scanner;

public class Loops2 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String input = "";

    while (!input.equals("java")) {
      System.out.println("Enter password: ");
      input = console.next();
    }
    System.out.println("The phone is unlocked!");
  }
}
