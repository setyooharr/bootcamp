package com.logic04;

import java.util.Scanner;

public class NumberArray {
    public static void PrintSort(String textNumber){

        Scanner inputObject = new Scanner(System.in);

        int[] intArray = Utility.ConvertToIntArray(textNumber);
        intArray = Utility.Sort(intArray);

        Utility.Print(intArray);
    }

    // No 06
    public static void PrintMean(String textNumber){
        double angka = 0;
        double jumlah = 0;
        Scanner inputObject = new Scanner(System.in);

        int[] intArray = Utility.ConvertToIntArray(textNumber);
        intArray = Utility.Sort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            angka += intArray[i];

        }

        jumlah = angka/intArray.length;
        System.out.println("Mean : " +jumlah);
    }

    //No 07
    public static void PrintMedian(String textNumber){

        double jumlah = 0;
        Scanner inputObject = new Scanner(System.in);

        int[] intArray = Utility.ConvertToIntArray(textNumber);
        intArray = Utility.Sort(intArray);

        for (int i = 0; i < intArray.length ; i++) {
            if (intArray.length % 2 == 0){
                jumlah = intArray[intArray.length/2] + intArray[intArray.length/2 -1] ;
                jumlah = jumlah / 2;
            }
            else {
                jumlah = intArray[intArray.length / 2] ;
            }
        }
        System.out.println("Median : " +jumlah);
    }

    // No 08
    public static void PrintMinMax(String textNumber){
        int max = 0;
        int min = 0;
        Scanner inputObject = new Scanner(System.in);

        int[] intArray = Utility.ConvertToIntArray(textNumber);
        intArray = Utility.Sort(intArray);

        min = intArray[0];
        max = intArray[intArray.length -1];

        System.out.println("min = " +min);
        System.out.println("max = " +max);
    }
}

