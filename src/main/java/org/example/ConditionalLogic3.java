package org.example;

import java.util.Scanner;

 /*
 Максимум из двух
  */
public class ConditionalLogic3 {
    static void main() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = console.nextInt();

        Scanner console2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        int number2 = console2.nextInt();

        if (number1 > number2) {
            System.out.print(number1);
        } else {
            System.out.print(number2);
        }
    }
}
