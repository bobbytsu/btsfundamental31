package com.juaracoding.ujianMinggu1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String namaFilm = "";
        while(namaFilm.isBlank()){
            System.out.print("Masukkan nama film: ");
            namaFilm = sc.nextLine();
        }
        sc.close();
        System.out.println("Nama film dalam huruf besar: "+namaFilm.toUpperCase());
    }
}
