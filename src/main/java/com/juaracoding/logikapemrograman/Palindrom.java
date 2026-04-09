package com.juaracoding.logikapemrograman;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        //Radar
        //radaR
        //buah -> haub
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String input = sc.nextLine();
        StringBuilder strTampung = new StringBuilder();
        char[] kata = input.toCharArray();
        for(int k=(kata.length-1);k>=0;k--){
            strTampung.append(kata[k]);//radar
        }
        System.out.println("Tampung : "+strTampung);
        if(strTampung.toString().equalsIgnoreCase(input)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
