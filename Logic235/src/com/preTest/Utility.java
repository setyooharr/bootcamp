package com.preTest;

public class Utility {
    public static int[] ConvertToIntArray(String text){
        String[] stringArray = text.split(",");
        int[] result = new int[stringArray.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]);
        }

        return result;
    }

    public static void Print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] Sort(int[] array){
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j + 1] < array[j]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
        return array;
    }

    public static int[] digitToArray(int number, int digitSum) {
        int i = 0;
        int[] digit = new int[digitSum];
        do {
            digit[i] = number % 10;
            number /= 10;
            i++;
        } while (number != 0);

        return digit;
    }
}
