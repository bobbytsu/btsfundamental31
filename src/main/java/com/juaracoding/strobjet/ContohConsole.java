package com.juaracoding.strobjet;

import java.util.Scanner;

public class ContohConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masuk Bilangan Bulat : ");//masukkan
        int intInput = sc.nextInt();
        intInput = intInput+1;
        System.out.println("Bilangan Bulat yang diinput setelah ditambahkan 1 adalah : "+intInput);
        System.out.print("Masuk Bilangan Desimal : ");
        double douInput = sc.nextDouble();
        System.out.println("Bilangan Desimal yang diinput adalah : "+douInput);
        long loInput = sc.nextLong();
    }
}
