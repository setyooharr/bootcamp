package com.logic04;

public class Utility {
    public static int[] ConvertToIntArray(String text) {

        String[] stringArray = text.split(",");
        int[] result = new int[stringArray.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]);
        }

        return result;
    }

    public static void Print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");

        }
    }

    public static int[] Sort(int[] intArray) { //shorting

        int temp = 0;

        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j + 1] < intArray[j]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }
}
    // 06
//    public static int[] Mean(int[] intArray){
//
//        double angka =0;
//        double jumlah = 0;
//
//        for (int i = 0; i < intArray.length; i++) {
//            angka += intArray[i];
//
//        }
//
//        jumlah = angka/intArray.length;
//        System.out.println("Mean : " +jumlah);
//        return intArray;
//    }
//    // 07
//    public static int[] Median(int[] intArray){
//        int angka = 0;
//        double jumlah = 0;
//
//
//        intArray = Utility.Sort(intArray);
//
//        for (int i = 0; i < intArray.length ; i++) {
//            if (intArray.length % 2 == 0){
//                jumlah = intArray[intArray.length/2] + intArray[intArray.length/2 - 1];
//                jumlah = jumlah / 2;
//            }
//            else {
//                jumlah = intArray[intArray.length / 2] ;
//            }
//        }
//        System.out.println("Median : " +jumlah);
//        return intArray;
//    }
//    //08
//    public static int[] MinMax(int[] intArray){
//        int max = 0;
//        int min = intArray.length;
//        for (int i = 0; i < intArray.length ; i++) {
//            if (max < intArray[i]){
//                max = intArray[i];
//            }
//            if (min > intArray[i]){
//                min = intArray[i];
//            }
//        }
//        System.out.println("min = " +min);
//        System.out.println("max = " +max);
//        return intArray;
//    }


