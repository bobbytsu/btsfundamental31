package com.juaracoding.method;

public class FormatMethod {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        nerusin();
        String strCall = callThis();//6 proses
        System.out.println(strCall);
        System.out.println(strCall);
        System.out.println(strCall);
        System.out.println(strCall);
    }

    public static void nerusin(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        callThis();
    }

    public static String callThis(){
        return "OK";
    }
}
