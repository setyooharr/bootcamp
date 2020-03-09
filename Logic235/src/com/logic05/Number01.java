package com.logic05;

import java.util.Scanner;

public class Number01 {

    public static int lengthOfDigit(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void Print() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many Ones do you want?");
        int input = scan.nextInt();
        int count = 0;
        int initial = 100;

        while (count < input) {
            int digit = lengthOfDigit(initial);
            int numbones = initial;

            for (int i = 0; i < 6; i++) {
                int sum = 0;
                int[] arr = new int[digit];
                int j = 0;
                do {
                    arr[j] = numbones % 10;
                    numbones /= 10;
                    j++;
                } while (numbones != 0);

                for (int k = 0; k < digit; k++) {
                    sum += arr[k] * arr[k];
                }

                if (sum == 1) {
                    count++;
                    System.out.println(initial + " is The One Number");
                    break;
                } else {
                    numbones = sum;
                    digit = lengthOfDigit(sum);
                }
            }
            initial++;
        }
    }
}



//soal no 4
//input = 4
//out = 100 , 103,109,129
// di mulai dari 100
//
