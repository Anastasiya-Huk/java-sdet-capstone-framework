package org.example.task_1139737;

/*
Swapping elements in an array
 */

public class Methods3 {

  public static void swapPlayerNumbers(int[] teamLineup) {
    int tmp = teamLineup[0];
    teamLineup[0] = teamLineup[1];
    teamLineup[1] = tmp;
  }

  public static void main(String[] args) {
    int[] playerSquad = {7, 9};

    swapPlayerNumbers(playerSquad);

    System.out.println(playerSquad[0] + " " + playerSquad[1]);
  }
}