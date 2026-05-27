package org.example;

import java.util.Scanner;

/*

 */

public class Exercise4 {
    static void main() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = console.nextInt();

        if (number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
    }
}
