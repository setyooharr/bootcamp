package com.logic05;

import java.util.Scanner;

public class NaikGunung {
    public static void Print01(){
        Scanner input = new Scanner(System.in);
        int mulaiNumber = 0;
        int naik = 0;
        int turun = 0;

        System.out.println("Masukkan kondisi : ");
        String inputKondisi = input.nextLine();

        char[] charArray = inputKondisi.toCharArray(); // memisahkan inputan per huruf

        for (int i = 0; i < inputKondisi.length() ; i++) {
            if (charArray[i] == 'U'){
                mulaiNumber += 1;
                if (mulaiNumber == 1){
                    naik++;
                }
            } else if (charArray[i] == 'D'){
                mulaiNumber -= 1;
                if (mulaiNumber == -1){
                    turun++;
                }
            }
        }
        System.out.println("Naik : " +naik);
        System.out.println("Turun : "+turun);
    }
}
// soal 1
// input = UUDDUDUDD
// out = naik = 3 , turun = 1
