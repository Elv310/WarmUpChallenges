package com.company;

import java.util.Scanner;

public class Divisible {

    public static void Divisible() {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int x;

        x = input.nextInt();
        if (x % 100 == 0) {
            System.out.println("The number you entered is divisible by 100");
        } else {
            System.out.println("The number you entered is not divisible by 100");
        }
    }
}


//https://edabit.com/challenge/KnRj8TSD63JBpzDfi
