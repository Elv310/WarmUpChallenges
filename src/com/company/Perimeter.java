package com.company;

import java.util.Scanner;

public class Perimeter {


    public static void  Perimeter(){

        int length, width,  perimeter;

        Scanner in = new Scanner(System.in);

        System.out.print(" Enter the length of rectangle: ");
        length = in.nextInt();


        System.out.print("Enter width of rectangle: ");
        width  = in.nextInt();

        perimeter = 2 * (length + width);



        System.out.println("Perimeter of rectangle is " + perimeter );



    }
}


// https://edabit.com/challenge/cMKLM7ExBd3TFJwPA