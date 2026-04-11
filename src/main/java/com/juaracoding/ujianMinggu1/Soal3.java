package com.juaracoding.ujianMinggu1;

public class Soal3 {

    public static int hargaTiket(boolean isWeekday){
        return isWeekday ? 35000 : 45000;
    }

    public static void total(int jumlahTiket, boolean isWeekday){
        int totalHarga = jumlahTiket*hargaTiket(isWeekday);
        System.out.println("Total harga: "+totalHarga);
    }

    public static void totalDenganDiskon(int jumlahTiket, boolean isWeekday){
        int totalHarga = (int)((jumlahTiket*hargaTiket(isWeekday))*0.9);
        System.out.println("Total harga (dengan diskon): "+totalHarga);
    }

    public static void main(String[] args) {

        int jumlahTiket = 6;
        boolean isWeekday = false;

        System.out.println("Jumlah tiket: " + jumlahTiket);
        if(jumlahTiket>5){
            totalDenganDiskon(jumlahTiket, isWeekday);
        } else {
            total(jumlahTiket, isWeekday);
        }

    }
}
