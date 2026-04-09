package com.juaracoding.arrayjava;

public class StringArray {


    public static void main(String[] args) {
        String[] strArr = new String[3];
        System.out.println("Refernsi Arr : "+strArr);
        strArr[0] = "Saya";
        strArr[1] = "Mau";
        strArr[2] = "Berenang";
        for(String s: strArr){
            System.out.println(s);
        }
        System.out.println(strArr[3]);// ini index out of bound
    }
}
