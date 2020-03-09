package com.logic03;

import java.util.Scanner;

public class Soal05 {
    public static void Print05(){
        int n, sum = 0, max = 0, min = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan banyak array : ");
        n = input.nextInt();
        int[] bilangan = new int[n];

        System.out.println("Masukan array : ");
        for (int i = 0; i < n; i++) {
            bilangan[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            sum = sum + bilangan[i];
        }

        for (int i = 0; i < n; i++) {
            int initial = sum - bilangan[i];
            if (i == 0)
            {
                min = initial;
                max = initial;
            }
            if (max < initial)
            {
                max = initial;
            }
            if (min > initial)
            {
                min = initial;
            }
        }
        System.out.println(min+  " " +max);
    }
}
