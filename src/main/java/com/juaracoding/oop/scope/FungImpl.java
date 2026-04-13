package com.juaracoding.oop.scope;

import java.util.ArrayList;
import java.util.List;

public class FungImpl {


    public static void main(String[] args) {
        //Dynamic Binding
        Fung1 f1 = new Fung2();
        f1.panggilFung2();

        List l = new ArrayList();
        Fung1 f11 = new Fung1() {
            @Override
            public void panggilFung12() {

            }
        };

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        t.start();

    }
}
