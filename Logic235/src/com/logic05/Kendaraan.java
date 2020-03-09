package com.logic05;

import java.util.Scanner;

public class Kendaraan {
    public static void Print09(){
        Scanner input = new Scanner(System.in);

        String bus = "bus", mobil = "mobil", motor = "motor", bajaj = "bajaj"; // nantinya pake equals
        int nilaiBus = 20, nilaiMobil = 5, nilaiMotor = 2, nilaiBajaj = 3; // inputan berdasarkan soal
        int countBus = 0, countMobil = 0, countMotor = 0, countBajaj = 0;// hitung mulai dari 0
        int tambah = 0, newCountNilai = 0, newNilai = 0;
        String newKendaraan = "";

        System.out.print("Input kata (Bus, Mobil, Motor, Bajaj) : ");
        String kendaraan = input.nextLine();

        String[] jenis = kendaraan.split(","); // semua inputan di masukkan ke string jenis, agar gampang di oleh

        for (int i = 0; i < jenis.length; i++) {
            if (jenis[i].equals(bus)) { // memproses data yang sudah ada
                countBus += 1;
            }
            else if (jenis[i].equals(mobil)) {
                countMobil += 1;
            }
            else if (jenis[i].equals(motor)) {
                countMotor += 1;
            }
            else if (jenis[i].equals(bajaj)) {
                countBajaj += 1;
            }
            else {
                if (jenis[i].equals(newKendaraan)) { // proses kendaraan berdasarkan inputan
                    newCountNilai += 1;
                }
                else {
                    System.out.print("Input kendaraan : ");
                    newKendaraan = input.nextLine();
                    System.out.print("Nilai : ");
                    newNilai = input.nextInt();
                    input.nextLine();
                    newCountNilai += 1;
                }
            }
        }

        int totalCountBus = countBus * nilaiBus;
        int totalCountMobil = countMobil * nilaiMobil;
        int totalCountMotor = countMotor * nilaiMotor;
        int totalCountBajaj = countBajaj * nilaiBajaj;
        int totalNewCountInput = newCountNilai * newNilai;

        int totalSemua = totalCountBus + totalCountMobil + totalCountMotor + totalCountBajaj + totalNewCountInput;

        System.out.println("Total muat semuanya : " +totalSemua);

    }
}

//soal no 9
//bus =20 ,mobil = 5,motor = 2, bajai = 3
//input = bus mobil bus motor bajai bajai
//(kalo tidak ada di data base berarti input sendiri dan isi sendiri )
//output = 55

// input dinamis