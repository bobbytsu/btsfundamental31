package com.juaracoding.exhandling;

import java.util.InputMismatchException;

public class ContohThrow {


    public static void main(String[] args) {
        int intInput = 12;
        if(intInput<14){
            throw new IllegalArgumentException("INI ERROR JUMLAH KURANG DARI 14");
        }
        System.out.println("SELESAI !!");
    }
}
