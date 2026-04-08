package com.juaracoding.exhandling;

public class ContohThrows {


    public static void main(String[] args) {
        try {
            callMe();
        } catch (InterruptedException e) {
            System.out.println("DISINI SAYA HANDLE !!");
        }
    }

    private static void callMe() throws InterruptedException {
        Thread.sleep(500);
    }
}
