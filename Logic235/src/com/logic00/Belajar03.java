package com.logic00;

import java.util.Scanner;

public class Belajar03 {
    static Scanner sc = new Scanner(System.in);

    static int saldoAwal,saldoAkhir,pilih,nominal;
    static String pin,setor,angka,rekening,setpin="123456";


    public static void perbankan() {
        System.out.print("Masukkan Pin : ");
        pin = sc.nextLine();

        if (cekpin(pin) == true) {
            System.out.print("Masukkan Uang yg Disetor: ");
            setor = sc.next().replaceAll(",", "");
            saldoAwal += Integer.parseInt(setor);

            System.out.println("Jenis Transfer: 1.Antar Rekening \t 2. Antar Bank");
            System.out.print("Pilihan : ");
            pilih = sc.nextInt();
            switch(pilih) {
                case 1: antarRekening();break;
                case 2: antarBank();break;
            }

        }
        else {
            System.out.println("PIN SALAH");
        }
    }

    public static int antarRekening() {
        System.out.print("Masukkan Rekening Tujuan: ");
        rekening = sc.next();

        if (rekening.length()==10) {
            System.out.print("Masukkan Jumlah Nominal: ");
            angka = sc.next().replaceAll(",", "");
            nominal = Integer.parseInt(angka);
            System.out.print("Masukkan Pin : ");
            pin = sc.next();
            if(cekpin(pin)==true) {
                saldoAkhir += saldoAwal-nominal;
                if(nominal>saldoAwal) {
                    System.out.println("Saldo Anda Tidak Mencukupi");
                }
                else if (nominal>0 && nominal<saldoAwal){
                    System.out.println("Transaksi Anda Berhasil, Saldo Anda Saat Ini");
                    System.out.println(saldoAkhir);
                }
            }
            else {
                System.out.println("PIN SALAH");
            }
        }
        else {
            System.out.println("Nomor Rekening Salah");
        }
        return saldoAkhir;
    }

    public static int antarBank() {
        System.out.print("Masukkan Kode Bank: ");
        String kode = sc.next();

        System.out.print("Masukkan Rekening Tujuan: ");
        rekening = sc.next();

        if(rekening.length()==10) {
            System.out.print("Masukkan Jumlah Nominal: ");
            angka = sc.next().replaceAll(",", "");
            nominal = Integer.parseInt(angka);
            System.out.print("Masukkan Pin : ");
            pin = sc.next();
            if(cekpin(pin)==true) {
                saldoAkhir += saldoAwal-nominal-7500;
                if(nominal>saldoAwal) {
                    System.out.println("Saldo Anda Tidak Mencukupi");
                }
                else if (nominal>0 && nominal<saldoAwal){
                    System.out.println("Transaksi Anda Berhasil, Saldo Anda Saat Ini");
                    System.out.println(saldoAkhir);
                }
            }
            else {
                System.out.println("PIN SALAH");
            }

        }
        else {
            System.out.println("Nomor Rekening Salah");
        }
        return saldoAkhir;
    }

    public static boolean cekpin(String pin) {
        if (pin.equals(setpin)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){

        perbankan();

    }
}
