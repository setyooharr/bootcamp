package com.logic00;


import java.util.Scanner;

public class Belajar02 {

    public int[] getArrayIntNoMax() {
        Scanner str = new Scanner(System.in);
        String strinput = str.nextLine();
        String strArr[] = strinput.split(" ");
        int arrx[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arrx[i] = Integer.parseInt(strArr[i]);
        }
        return arrx;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya: ");
        int a = sc.nextInt();
        int dapat=0;
        int ang = 100;
        while(dapat < a) {
            String n = Integer.toString(ang);
            char[] c =new char[n.length()];
            for (int i = 0; i < n.length(); i++) {
                c[i]=n.charAt(i);
            }
            int[] i = new int[c.length];
            for (int j = 0; j < c.length; j++) {
                i[j]=Integer.parseInt(String.valueOf(c[j]));
            }
            int jum=0,sum=0;
            for (int j = 0; j < i.length; j++) {
                sum += (i[j]*i[j]);
            }
            String fix = Integer.toString(sum);
            if(fix.contains("1")) {
                System.out.println(ang+" adalah Si Angka 1");
                ang++;
                dapat++;
            }
            else {
                ang++;
            }
        }
    }
}
