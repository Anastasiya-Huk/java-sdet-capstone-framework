package org.example;

import java.util.Scanner;

/*
 Проверка возраста
 */
public class Exercise2 {
    static void main() {
        System.out.print("Enter age: ");
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();

        if (age >= 18){
            System.out.print("Access allowed");
        }else{
            System.out.print("Access denied");
        }

    }
}
