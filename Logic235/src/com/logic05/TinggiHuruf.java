package com.logic05;

import java.util.Scanner;

public class TinggiHuruf {
    public static void Print07() {

        int result = 0;// ini kenapa disini ??
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        String[] kalimatArray = kalimat.split(" ");

        for (String text : kalimatArray) {
            char[] charArray = text.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                if ((int) charArray[i] % 2 == 0 && Character.isUpperCase(charArray[i])) { //abjad besar
                    result += 3;
                } else if ((int) charArray[i] % 2 != 0 && Character.isUpperCase(charArray[i])) {
                    result += 2;
                } else if ((int) charArray[i] % 2 == 0 && Character.isLowerCase(charArray[i])) { // abjad kecil
                    result += 2;
                } else if ((int) charArray[i] % 2 != 0 && Character.isLowerCase(charArray[i])) {
                    result += 1;
                }
            }
        }
        System.out.println("Penjumlahan Dari Kalimat Tersebut : " + result);
    }
}

//soal no 7
//input = aku sayang kamu
// 14
// ABCDE - Z
// 23232 -

//abcde - z
//12121 -
