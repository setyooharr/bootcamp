package com.preTest;

import java.util.Scanner;

public class Soal10 {
    public static void Print10() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert sum do you want : ");
        int input = scan.nextInt();

        int firstFibo = 0;
        int addFibo = 1;
        int[] fibo = new int[input];

        for (int i = 0; i < input; i++) {
            fibo[i] = firstFibo +addFibo;
            addFibo = firstFibo;
            firstFibo = fibo[i];
        }

        int[] prime = new int[input];
        int countPrime = 0;
        int initial = 2;

        int j = 0;
        while (countPrime < input) {

            int flag = 1;
            for (int i = 2; i < initial; i++) {
                if (initial % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                prime[j] = initial;
                initial++;
                countPrime++;
                j++;
            }
            else{
                initial++;
            }
        }
        int[] sum = new int[input];
        for (int i = 0; i < input; i++) {
            sum[i] = fibo[i] + prime[i];
            System.out.print(sum[i] + " ");
        }

        System.out.println();
    }
}
