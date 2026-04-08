package com.juaracoding.exhandling;

import java.util.Scanner;

public class UncheckExample {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        if(size==0){
            callThis();
        }
        System.out.println("AMAN !!");
    }

    private static void callThis(){
        int z = 1/0;
    }
}
