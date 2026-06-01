package org.example.task_1139737;

/*
Checking the password length
 */

import java.util.Scanner;

public class Loops9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String password;

        do {
            System.out.println("Enter your password (at least 6 characters): ");
            password = console.nextLine();

        } while (password.length() < 6);

        System.out.println("The password is secure.");
    }
}
