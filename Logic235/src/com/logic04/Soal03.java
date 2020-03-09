package com.logic04;

import java.util.Scanner;

public class Soal03 {
    public static void Print03(String text){

        int angka = 0;
        Scanner inputObject = new Scanner(System.in);

        int[] intArray = Utility.ConvertToIntArray(text);
        intArray = Utility.Sort(intArray);

        for (int i = 0; i < intArray.length -1; i+=2) {
            if (intArray[i] == intArray[i +1]){
                angka++;
            }
        }
        System.out.println("jumlah kaoskaki : " +angka);
    }
}
