package com.logic05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pustaka {
    public static void Print05() {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Masukan tanggal hari , bulan , tahun peminjaman (dd/mm/yyyy) : ");
            String date1 = scan.nextLine();
            String month1 = scan.nextLine();
            String year1 = scan.nextLine();
            String cal1 = date1 + "/" + month1 + "/" + year1;

            System.out.println("Masukan tanggal hari , bulan , tahun pengembalian (dd/mm/yyyy) : ");
            String date2 = scan.nextLine();
            String month2 = scan.nextLine();
            String year2 = scan.nextLine();
            String cal2 = date2 + "/" + month2 + "/" + year2;

            String format = "dd/MM/yyyy";

            SimpleDateFormat sdf = new SimpleDateFormat(format);

            Date cal11 = sdf.parse(cal1);
            Date cal22 = sdf.parse(cal2);

            long diff = cal22.getTime() - cal11.getTime();

            int diffDays = (int) (diff / (24 * 60 * 60 * 1000));

            int penalty = 0;
            if (diffDays > 3){
                penalty = (diffDays - 3) * 5000;
            }

            System.out.println("Denda yang harus di bayar : " + penalty);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//soal no 5
//soal no 3 di wa
//date time
