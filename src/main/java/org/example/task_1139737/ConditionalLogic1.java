package org.example.task_1139737;

import java.util.Scanner;

/**
 * Четное или нечетное число
 */
public class ConditionalLogic1 {
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
