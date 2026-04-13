package com.juaracoding.oop.scope;

import java.util.Random;
import java.util.Scanner;

public class Coretan {

    private String nama;
    public Coretan() {
    }

    public Coretan(String nama) {
        this.nama = nama;
    }

    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10));
        }
        User u = new User();
        System.out.println(u==null?new User():u.getId());
        DBConProperties db = new DBConProperties("","","","");

        Coretan2 c2= new Coretan2();
        c2.proses1(1,"a");
        c2.proses1("a",1);

//        Class1 c1= new Class1();
    }
}