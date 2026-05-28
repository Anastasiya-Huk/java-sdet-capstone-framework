package org.example;

/*
Simple Calculator
 */

import java.util.Scanner;

public class SimpleCalculations2 {
    static void main() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = console.nextInt();

        System.out.print("Enter operator: ");
        String operator = console.next();

        System.out.print("Enter number 2: ");
        double number2 = console.nextInt();

        if (operator.equals("+")) {
            System.out.println("Result: " + (number1 + number2));
        } else if (operator.equals("-")) {
            System.out.println("Result: " + (number1 - number2));
        } else if (operator.equals("*")) {
            System.out.println("Result: " + (number1 * number2));
        } else if (operator.equals("/")) {

            if (number2 == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println("Result: " + (number1 / number2));
            }

        } else {
            System.out.println("Invalid operator");
        }
    }
}