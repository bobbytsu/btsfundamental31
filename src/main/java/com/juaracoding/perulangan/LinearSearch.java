package com.juaracoding.perulangan;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int intArr [] = {5,8,3,12,1,0,44,25,101};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int n = input.nextInt();
        for(int i=0;i<intArr.length;i++){
            if(n==intArr[i]){
                System.out.println(intArr[i]+" Ketemu Bruh !!");
                break;
            }
        }
        System.out.println(1);
        System.out.println(1L);
        System.out.println("A");
        System.out.println('b');
        System.out.println(true);
        System.out.println(new Object());
    }
}
