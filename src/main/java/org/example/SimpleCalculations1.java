package org.example;

import java.util.Scanner;

/*
Sum of Two Numbers
 */

public class SimpleCalculations1 {
    static void main() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = console.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = console.nextInt();

        System.out.println("Sum: " + (number1 + number2));
    }
}
