package org.example.task_1139737;

/*
Finding a number
 */

import java.util.Scanner;

public class Arrays10 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = console.nextInt();
        boolean result = false;

        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]){
                result = true;
                break;
            }
        }

        if (result == true) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
