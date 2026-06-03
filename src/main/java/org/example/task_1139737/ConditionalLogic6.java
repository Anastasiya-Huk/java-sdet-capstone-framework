package org.example.task_1139737;

/*
Conditions for obtaining a bank loan
 */

public class ConditionalLogic6 {

  public static void main(String[] args) {
    int yourAge = 25;
    boolean hasJob = true;
    boolean hasCreditHistory = false;
    boolean hasGuarantor = true;

    boolean credit1 = (yourAge > 21 && hasJob) || (hasCreditHistory && hasGuarantor);

    boolean credit2 = (yourAge > 21) && (hasJob || hasCreditHistory) && hasGuarantor;

    System.out.println(credit1 + " " + credit2);
  }
}
