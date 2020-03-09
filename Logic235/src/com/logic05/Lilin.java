package com.logic05;

import java.util.Scanner;

public class Lilin {
    public static void Print03() {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka : ");
        String angka = input.nextLine();

        String[] strArray = angka.split( ",");

        int[] intArray = new int[strArray.length];
        int[] resultArray = new int[intArray.length];
        int[] tempArray = new int[intArray.length];
        int x = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (i <= 1) {
                resultArray[i] = 1;
            } else {
                resultArray[i] = resultArray[i - 1] + resultArray[i - 2];
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            tempArray[i] = intArray[i];
        }

        while (x != 1) { // untuk apa ?
            for (int j = 0; j < intArray.length; j++) {
                tempArray[j] = tempArray[j] - resultArray[j];

                if (tempArray[j] == 0) {
                    System.out.println("Lilin yang habis duluan adalah : " + (j + 1));
                    x = 1;
                    break;
                }
            }
        }
    }
}

//soal no 3
// input = 5,3,2,7
// out = lilin ke 3
