package org.example.task_1139737;

/*
Copying elements from an array
 */

import java.util.Arrays;

public class Arrays12 {

  public static void main(String[] args) {
    int[] dailyTemperatures = {10, 20, 30, 40, 50, 60, 70};
    int[] arr = Arrays.copyOfRange(dailyTemperatures, 2, 5);
    System.out.println(Arrays.toString(arr));
  }
}
