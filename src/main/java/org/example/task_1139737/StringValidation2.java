package org.example.task_1139737;

import java.util.Scanner;

/*
Email Validation
 */

public class StringValidation2 {

  static void main() {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter email: ");
    String email = console.nextLine();

    if (email.contains("@") && email.contains(".")) {
      System.out.print("Valid email");
    } else {
      System.out.print("Invalid email");
    }
  }
}
