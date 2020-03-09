package com.preTest;

import java.util.Scanner;

public class ContohLain01 {
    public static void Print() {
        Scanner scan = new Scanner(System.in); //scanner

        System.out.println("Insert input : ");
        int input = scan.nextInt(); // int karena inputannya angka

        int pointBonus;

        if (input > 30000) { // langsung di masukin semua kondisi disini
            pointBonus = (input - 30000) / 1000 * 2;
            int nextInput = 30000;
            pointBonus = pointBonus + (nextInput - 10000) / 1000;
        }
        else if (input > 10000) { // kondisi ke 2
            pointBonus = (input - 10000) / 1000;
        }
        else { // tidak mencukupi pulsa nya
            pointBonus = 0;
        }

        System.out.println("Input Bonus : " + pointBonus);
    }
}
