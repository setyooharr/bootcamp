package com.logic05;

import java.util.Scanner;

public class NilaiMurid {
    public static void Print08() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai : ");
        String textNumber = input.nextLine();

        int[] intArray = Utility.ConvertToIntArray(textNumber);
        int[] arr = new int[2];// ??

        for (int i = 0; i < intArray.length ; i++) {
            if (intArray[i] < 40){ // jika di bawah 40 maka tidak ada bantuan
                System.out.print(intArray[i] + " ");
            }
            else{
                int j = 0;
                do{
                    arr[j] = intArray[i] % 10;
                    intArray[i] /= 10;
                    j++;
                } while(intArray[i] != 0);

                if(arr[0] < 3) {
                    arr[0] = 0;
                }
                else if (arr[0] >= 3 && arr[0] <= 5) {
                    arr[0] = 5;
                }
                else if (arr[0] <= 7) {
                    arr[0] = 5;
                }
                else {
                    arr[0] = 0;
                    arr[1] += 1;
                }

                System.out.print(arr[1] + "" + arr[0] + " ");
            }
        }
    }
}

//nomor 8
// input 23,21,45,37,56,72
//output 23,21,45,37,55,70
// di bawah 40 tidak ada bantuan
// bulatkan 1 5 10
