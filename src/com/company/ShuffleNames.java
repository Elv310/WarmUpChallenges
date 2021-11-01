package com.company;

public class ShuffleNames {

    public static void ShuffleNames(){
        String strName = "Michael Jackson";

        System.out.println(strName.substring(strName.indexOf(" ") + 1) + " " + strName.substring(0, strName.indexOf(" ")));
    }
}
