package com.logic00;


import java.util.Scanner;

public class Belajar01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai (n): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i+=2) {
            if (i%3==0) {
                System.out.print("* \t");
            }
            else {
                System.out.print(i+"\t");
            }

        }
        System.out.println();
        for (int i = 2; i <= n; i+=2) {
            if(i%3==0) {
                System.out.print("* \t");
            }
            else {
                System.out.print(i+"\t");
            }

        }
        System.out.println();
    }
}
