package com.juaracoding.logikapemrograman;

import java.util.Random;

public class ContohRandom {

    public static void main(String[] args) {
        Random rand = new Random();
        for(int k=0;k<10;k++){
            System.out.println(rand.nextInt(1001));
        }
    }
}
