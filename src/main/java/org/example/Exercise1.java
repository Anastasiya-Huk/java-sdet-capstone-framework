package org.example;

import java.util.Scanner;

public class Exercise1 {
    static void main() {
        System.out.print("Enter: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        if (number % 2 == 0) {
            System.out.println("Countable");
        } else {
            System.out.println("Uncountable");
        }
    }
}
