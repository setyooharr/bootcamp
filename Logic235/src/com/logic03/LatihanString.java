package com.logic03;

import java.util.Scanner;

public class LatihanString {
    public void string1(){
        Scanner input = new Scanner(System.in);
        System.out.println("tulis deret angka dalam string : ");
        String str = input.nextLine();
        System.out.println(str);
        String[] strarr = str.split(",");

        for (int i = 0; i < strarr.length; i++) { //memasukan string ke array
            System.out.println("strarr["+i+"] = " + strarr[i]);

        }
        String x = ""; // mengubah array ke string
        for (int i = 0; i < strarr.length ; i++) {
            x += strarr[i];
        }
        System.out.println("String array to string : " + x);
    }
}
