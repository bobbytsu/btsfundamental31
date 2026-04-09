package com.juaracoding.perulangan;

import java.util.Scanner;

public class ContohSkip {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Nilai i : "+i);
        }
    }
}
