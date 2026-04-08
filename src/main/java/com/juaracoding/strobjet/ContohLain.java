package com.juaracoding.strobjet;

public class ContohLain {

    public static void main(String[] args) {
//        String strWith = "cumiGoreng";
//        System.out.println(strWith.startsWith("cumi"));
        String strEnd = "tepungcumi";
        System.out.println(strEnd.endsWith("cumi"));
        String strDelimiter = "paul#paul@gmail.com#0812934509304";
        String [] strArr = strDelimiter.split("#");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        String strContains = "Ini Buah Jeruk";
        System.out.println(strContains.contains("Buah"));
//      Client Side  Request Forgery
//      Server Side  Request Forgery
    }
}