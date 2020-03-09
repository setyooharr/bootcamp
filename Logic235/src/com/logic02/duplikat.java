package com.logic02;

import java.util.Scanner;

public class duplikat {
    public static void Printduplikat(){
        Scanner input = new Scanner(System.in);

        System.out.println("---------------");
        String inputString = input.nextLine();

        String[] inputArray = inputString.split( "");

        for (String text : inputArray){
            char[] charArray = text.toCharArray();

            for (int i = 0; i < charArray.length; i++){
                if(i == 0 || i == text.length() - 1){
                    System.out.print(charArray[i]);
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
