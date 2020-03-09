package com.logic05;

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



