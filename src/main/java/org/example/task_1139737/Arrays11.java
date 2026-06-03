package org.example.task_1139737;

/*
Filling an array with a value
 */

import java.util.Arrays;

public class Arrays11 {

  public static void main(String[] args) {
    String[] warehouseSlots = new String[6];
    Arrays.fill(warehouseSlots, "Empty");
    System.out.println(Arrays.toString(warehouseSlots));
  }
}
