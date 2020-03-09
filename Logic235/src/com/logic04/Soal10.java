package com.logic04;

import java.util.Scanner;

public class Soal10 {
    public static void Print10(){

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan kalimat / kata : ");
        String inputString = input.nextLine();

        System.out.println("Masukan selisih : ");
        int inputSelisih = input.nextInt();

        while (inputSelisih > 26){
            inputSelisih -= 26;
        }

        String[] inputArray = inputString.split( " ");// menyaring separi dari inputan string

        for(String text : inputArray) { // untuk perulangan inoutan

            char[] charArray = text.toCharArray();// memisahkan per abjad dari satu kata

            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] + inputSelisih > 'z'){
                    charArray[i] = (char) ((charArray[i] - 26) + inputSelisih);  // konsistensi mengubah jadi char
                }
                else if(charArray[i] + inputSelisih > 'Z' && Character.isUpperCase(charArray[i])){
                    charArray[i] = (char) ((charArray[i] - 26) + inputSelisih);
                }
                else  {
                    charArray[i] += inputSelisih;
                }

                System.out.print(charArray[i]);
            }

            System.out.print(" ");
        }
    }
}
