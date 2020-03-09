package com.logic00;

import java.util.Scanner;
import java.util.Random;

public class Belajar04 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    public static void gamegambaran() {
        int a, b,jum1,jum2,tawar;
        String pilihan;
        System.out.print("Masukkan Jumlah Gambaran: ");
        jum1=jum2=sc.nextInt();

        //jum 1 merupakan gambaran milik saya dan jum2 merupakan gambaran milik komputer

        while(jum1 > 0 || jum2 > 0) {
            System.out.println("Jumlah Gambaran Anda : "+jum1);
            System.out.println("Jumlah Gambaran Lawan: "+jum2);
            System.out.print("Masukkan Jumlah Tawaran: ");
            tawar = sc.nextInt();
            if (tawar<=jum1 && tawar<=jum2) {
                System.out.print("Masukkan Pilihan: ");
                pilihan = sc.next();
                a = rd.nextInt(10);
                b = rd.nextInt(10);
                if (pilihan.equalsIgnoreCase("a")) {
                    if(a>b){
                        System.out.println(a+"-"+b+" "+"You Win");
                        jum1+=tawar;
                        jum2-=tawar;
                    }
                    else if(b>a){
                        System.out.println(a+"-"+b+" "+"You Lose");
                        jum1-=tawar;
                        jum2+=tawar;
                    }
                    else System.out.println(a+"-"+b+" "+"Draw");
                }
                else if (pilihan.equalsIgnoreCase("b")){
                    if(b>a){
                        System.out.println(a+"-"+b+" "+"You Win");
                        jum1+=tawar;
                        jum2-=tawar;
                    }
                    else if(a>b) {
                        System.out.println(a+"-"+b+" "+"You Lose");
                        jum1-=tawar;
                        jum2+=tawar;
                    }
                    else System.out.println(a+"-"+b+" "+"Draw");
                }
                if (jum2==0) {
                    System.out.println(jum1+"-"+jum2+" ~~~ Congratulations ~~~");
                    break;
                }
                else if(jum1==0){
                    System.out.println(jum1+"-"+jum2+" Sorry You Lose");
                    break;
                }
            }
            else {
                System.out.println("Jumlah Penawaran Melebihi Kartu dimiliki");
            }
        }
    }

    public static void main(String[] args) {

        gamegambaran();
    }
}
