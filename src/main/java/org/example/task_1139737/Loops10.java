package org.example.task_1139737;

/*
Sales summation
 */

import java.util.Scanner;

public class Loops10 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int sum = 0;

    while (true) {
      System.out.println("Enter the sales amount: ");
      int cost = console.nextInt();

      if (cost < 0) {
        break;
      }
      sum += cost;
    }
    System.out.println("Total sales amount: " + sum);
  }
}
