package org.example.task_1139737;

/*
Menu with choice
 */

import java.util.Scanner;

public class Loops8 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String menu = "Menu:\n1. Display greeting\n2. Exit";
    int number;

    do {
      System.out.println(menu);
      number = console.nextInt();

      if (number == 1) {
        System.out.println("Hello!");
      }

    } while (number != 2);
  }
}
