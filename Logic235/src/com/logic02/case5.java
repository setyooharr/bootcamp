package com.logic02;

import java.util.Scanner;

public class case5 {
    public static void Printcase5() {
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKKAN KATA : ");
        String inputString = input.nextLine();
        int count = 1;

        for (int i = 0; i < inputString.length() ; i++) {
            String letter = Character.toString(inputString.charAt(i));
            if (letter == letter.toUpperCase()){
                count++;
            }

        }
        System.out.print(count);


    }
}
