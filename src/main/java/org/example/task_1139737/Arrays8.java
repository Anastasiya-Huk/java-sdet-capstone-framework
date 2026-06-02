package org.example.task_1139737;

/*
Count the number of even numbers in an array
 */

public class Arrays8 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 10, 15, 18, 21};
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                count = count + 1;
            }
        }
            System.out.println("Even numbers count = " + count);
        }
    }
