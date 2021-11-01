package com.company;

public class CountWords {

    public static void CountWords(){

        String str = "Just an example here move along";
        int wordCount = 1;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                wordCount++;
            }
        }

        System.out.println("Word count is = " + wordCount);
    }

}


//https://edabit.com/challenge/5LnycSd2xT4uwZCpi
