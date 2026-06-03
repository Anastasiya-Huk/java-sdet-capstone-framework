package org.example.task_1139737;

/*
Returning the amount and displaying it
 */

public class Methods2 {

  public static int calculateTotalGrades(int[] studentExamResults) {
    int sum = 0;
    for (int i = 0; i < studentExamResults.length; i++) {
      sum += studentExamResults[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] currentGrades = {5, 4, 3, 5, 4};
    int finalTotalPoints = calculateTotalGrades(currentGrades);
    System.out.println("Result: " + finalTotalPoints);
  }
}
