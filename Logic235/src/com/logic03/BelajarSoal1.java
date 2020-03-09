package com.logic03;

import java.util.Scanner;

public class BelajarSoal1 {
    // 1*3*4*6*8 -> 1#3#4#6#8# UBAH BINTANG KE PAGAR
    public void string2(){
        Scanner input = new Scanner(System.in);
        System.out.println("input : ");
        String str = input.nextLine();
        System.out.println(str);

        String[] strarr = str.split( "\\*");

        String x = "";
        for (int i = 0; i < strarr.length ; i++) {
            x += strarr[i] + "#";
        }
        System.out.println("output : " + x);

    }
}

//        for (int i = 0; i < strarr.length ; i++) {
//            System.out.print(strarr[i]);
//        }