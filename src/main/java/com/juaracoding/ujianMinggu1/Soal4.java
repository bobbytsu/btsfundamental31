package com.juaracoding.ujianMinggu1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] namaFilmArr = new String[5];
        System.out.println("Daftar film bioskop");
        for (int i = 0; i < namaFilmArr.length; i++) {
            String input;
            do {
                System.out.print("Masukkan nama film "+ (i+1) + ": ");
                input = sc.nextLine();
            } while(input.isBlank());
            namaFilmArr[i] = input;
        }
        sc.close();
        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < namaFilmArr.length; i++) {
            System.out.println((i+1)+". " + namaFilmArr[i]);
        }

    }
}
