package com.juaracoding.logikapercabangan;

public class OperatorTernary {

    public static void main(String[] args) {
        //wrapper class
        //Integer -> int
        //Double -> double
        //Boolean -> boolean
        //Character -> char
        //Long -> long
        Integer intInput = 75;
        if(intInput>80){
            System.out.println("Selamat Anda Lulus");
        }else {
            System.out.println("Selamat Anda Tidak Lulus");
        }

        String message = (intInput>80)?"Selamat Anda Lulus":"Anda Tidak Lulus!!";
        System.out.println(message);

        int intTampung = (intInput==null)?0:intInput;
        if(intTampung==0){
            //script response ke client "Tidak Boleh NULL"
        }
        System.out.println(message);
    }
}
