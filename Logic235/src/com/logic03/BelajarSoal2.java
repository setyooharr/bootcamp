package com.logic03;

import java.util.Scanner;

public class BelajarSoal2 {
    // 1 2 3 4 5 6 -> 1_2_3_4_5_6
    public void string3(){
        Scanner input = new Scanner(System.in);
        System.out.println("input : ");
        String str = input.nextLine();
        System.out.println(str);

        String[] strarr = str.split( " ");

        String x = "";
        for (int i = 0; i < strarr.length  ; i++) {
            x += strarr[i] + "_";

        }
        System.out.println("output : " +x );

    }
}
