package org.example;

import java.util.Scanner;

public class StringValidation1 {
    static void main() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = console.nextLine();

        if (password.length() >= 8){
            System.out.print("Valid password");
        }else{
            System.out.print("Invalid password");
        }
    }
}
