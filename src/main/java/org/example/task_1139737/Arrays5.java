package org.example.task_1139737;

/*
Displaying array elements in reverse order
 */

import java.util.Scanner;

public class Arrays5 {

  public static void main(String[] args) {
    String[] favoriteMovies = new String[3];
    Scanner console = new Scanner(System.in);

    for (int i = 0; i < favoriteMovies.length; i++) {
      favoriteMovies[i] = console.nextLine();
    }
    for (int i = favoriteMovies.length - 1; i >= 0; i--) {
      System.out.println(favoriteMovies[i]);
    }
  }
}
