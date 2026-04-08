package com.juaracoding.logikapercabangan;

public class ContohIfElse {

    public static void main(String[] args) {
        int intInput = 4;
        if(intInput>3){
            System.out.println("Lebih dari 3");
        }else if(intInput>3 && intInput<20){
            System.out.println("Lebih dari 3");
        }else {
            System.out.println("Masuk ke Else");
        }
        System.out.println("Proses 1 selesai !!");

        int intInput2 = 10;
        if(intInput2%2==0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
        System.out.println("Proses 2 selesai !!");
    }
}
