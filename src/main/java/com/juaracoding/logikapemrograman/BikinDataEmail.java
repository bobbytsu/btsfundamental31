package com.juaracoding.logikapemrograman;

import java.util.Random;

public class BikinDataEmail {

    /**
     * huruf kecil 3 - 10
     * .
     * angka 1 - 1001
     * @
     * provider (gmail,ymail,rocketmail,yahoo,tikus)
     * .
     * domain (co.id,com,id,edu,ac.id)
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random();//16 digit

        String strHurufKecil = "abcdefghijklmnopqrstuvwxyz";
        char [] chArr = strHurufKecil.toCharArray();
        String [] strProvider = {"gmail","yahoo","rocketmail","ymail","tikus"};
        String [] strDomain = {"co.id","com","edu","ac.id","org"};
        StringBuilder sbuild = new StringBuilder();
        for(int i=0;i<100;i++){
            sbuild.setLength(0);
            int intRand = rand.nextInt(3,11);
            for (int j = 0; j < intRand; j++) {
                sbuild.append(chArr[rand.nextInt(chArr.length)]);
            }
            sbuild.append(".").append(rand.nextInt(1001)).append("@").
                    append(strProvider[rand.nextInt(strProvider.length)]).append(".").append(strDomain[rand.nextInt(strDomain.length)]);
            System.out.println(sbuild.toString());
        }

    }
}
