package org.example.task_1139737;

/*
Entering a PIN code
 */

import java.util.Scanner;

public class Loops7 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int pin;

    do {
      System.out.println("Enter PIN: ");
      pin = console.nextInt();

    } while (pin < 1000 || pin > 9999);

    System.out.println("PIN accepted");
  }
}
