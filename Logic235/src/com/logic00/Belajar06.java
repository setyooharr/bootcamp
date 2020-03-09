package com.logic00;

import java.util.Scanner;

public class Belajar06 {
    public static void NaikGunung(String kode) {
        int initial=0,gunung=0,lembah=0,countN=0;
        String B="";
        String A = kode.toLowerCase().replace(" ", "");

        for (int i = 0; i < A.length()-1; i+=2) {
            B += A.charAt(i);
            B += A.charAt(i+1);
            if (B.equals("nt")) {
                if (initial==0) {
                    gunung++;
                    initial++;
                    initial--;
                }
                else {
                    initial++;
                    initial--;
                }
            }
            else if(B.equals("tn")) {
                if (initial==0) {
                    lembah++;
                    initial--;
                    initial++;
                }
                else {
                    initial--;
                    initial++;
                }

            }
            else if (B.equals("nn")) {
                initial+=2;

            }
            else if(B.equals("tt")){
                initial-=2;
            }
            B="";
        }
        System.out.print("Gunung = "+ gunung );
        System.out.println(" <--> Lembah = "+ lembah);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan simbol: ");
        NaikGunung(sc.nextLine());
    }
}
