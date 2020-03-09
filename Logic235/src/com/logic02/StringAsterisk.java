package com.logic02;

import java.util.Scanner;

public class StringAsterisk {
    public static void Print01(){
        Scanner input = new Scanner(System.in);

        System.out.println(" 1 . MASUKKAN KALIMAT/KATA : ");
        String inputString = input.nextLine();

        String[] inputArray = inputString.split( " "); // memisahkan spasi

        for(String text : inputArray) {

        char[] charArray = text.toCharArray(); //membaca panjang string per kata

        for (int i = 0; i <  charArray.length; i++) {
            if(i == 0 || i == text.length() -1) // membaca per abjad
            {
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

    public static void Print02(){
        //nomor 02 a*u s***g k***u = aku sayang kamu
        Scanner input = new Scanner(System.in);

        System.out.println("2. MASUKKAN KALIMAT/KATA : ");
        String inputString = input.nextLine();

        String[] inputArray = inputString.split( " ");
        for(String text : inputArray)
        {
            char[] charArray = text.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                if(i == 0 || i == text.length() - 1 ) {
                    System.out.print(charArray[i]);
                }
                else if (i == text.length() / 2) {
                    System.out.print("***");
                }
                else {
                    System.out.print("");
                }
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void Print03(){
        // nomor 03 u*a g*s u*k = aku sayang kamu
        // string di java menggunaka equals()
        Scanner input = new Scanner(System.in);
        String resultt;

        System.out.println("3. MASUKKAN KALIMAT/KATA : ");
        String inputString = input.nextLine();

        String[] inputArray = inputString.split( " ");
            for(String text : inputArray) {
                char[] charArray = text.toCharArray();
                //resultt = charArray[charArray.length - 1] + "*" + charArray[0];
                for (int i = 0; i < charArray.length ; i++) {
                    if(i == 0){
                        System.out.print(charArray[charArray.length - 1]);
                    } else if (i == text.length() - 1) {
                        System.out.print(charArray[0]);
                    } else if (i == text.length() / 2){
                        System.out.print("*");
                    } else {
                        System.out.print("");
                    }
                }
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void Print04(){
        //nomor 04 a*u  *a*a*g  k*m* = aku sayang kamu
        Scanner input = new Scanner(System.in);
        System.out.println(" 4 . MASUKKAN KALIMAT/KATA : ");
        String inputString = input.nextLine();

        String[] inputArray = inputString.split( " ");

            for (int i = 0; i < inputArray.length; i++) {
                char[] charArray = inputArray[i].toCharArray();
                    if(i % 2 == 0 ){
                        for (int j = 0; j < charArray.length; j++) {
                            if( j % 2 == 0) {
                                System.out.print(charArray[j]);
                            }
                            else {
                                System.out.print("*");
                            }
                        }
                    }
                    else {
                        for (int j = 0; j < charArray.length; j++) {
                            if(j % 2 == 0) {
                                System.out.print("*");
                            }
                            else {
                                System.out.print(charArray[j]);
                            }
                        }
                    }
                    System.out.print(" ");
                }
            System.out.println();
        }
    }







