package org.example.task_1139737;

/*
Display the sum of all elements in an array
 */

public class Arrays6 {
    public static void main(String[] args) {
        int[] itemPrices = {5, 7, 2, 9};
        int sum = 0;
        for (int i = 0; i < itemPrices.length; i++){
            sum += itemPrices[i];
        }
        System.out.println(sum);
    }
}
