package com.juaracoding.arrayjava;

public class StringArray2 {


    public static void main(String[] args) {
        String[] strArr = {"Volvo","BMW","VW","Honda","Mazda"};
        System.out.println("Refernsi Arr : "+strArr);
        for(String s: strArr){
            System.out.println(s);
        }
        System.out.println(strArr[6]);// ini index out of bound
    }
}
