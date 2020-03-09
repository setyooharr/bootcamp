package com.logic02;

import java.util.Scanner;

public class Palindrome {
    public static void PrintPalindrome(){
        Scanner input = new Scanner(System.in);

        System.out.println("MASUKKAN KATA : ");
        String inputString = input.nextLine();
        
        char[] charArray1 = inputString.toCharArray();
        char[] charArray2 = inputString.toCharArray();
        boolean hasil = true;

        for (int i = inputString.length() - 1 ; i >= 0  ; i--) {
            for (int j = 0; j < inputString.length() ; j++) {
                if (charArray1[i] == charArray2[j]){
                    hasil = true;
                } else {
                    hasil = false;
                }
            }
        }
        if (hasil == true ){
            System.out.print("kata termasuk ");
        }else {
            System.out.print("kata tidak termasuk");
        }
    }
}
