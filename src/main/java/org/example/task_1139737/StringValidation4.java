package org.example.task_1139737;

/*
Username Length Check
 */

import java.util.Scanner;

public class StringValidation4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scan.nextLine();

        if (username.length() >= 3 && username.length() <= 15){
            System.out.print("Valid username");
        }else{
            System.out.print("Invalid username");
        }
    }
}
