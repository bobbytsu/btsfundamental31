package com.juaracoding.logikapercabangan;

public class ContohLainIf {
    public static void main(String[] args) {
        String huruf = "e";
        if(
                huruf.equals("a")||
                huruf.equals("i")||
                huruf.equals("u")||
                huruf.equals("e")||
                huruf.equals("o")
        ){
            System.out.println("Huruf Vokal");
        }else {
            System.out.println("Huruf Konsonan");
        }

        if(
                huruf.equals("b")||
                huruf.equals("c")||
                huruf.equals("d")||
                huruf.equals("f")||
                huruf.equals("g")||
                huruf.equals("h")||
                huruf.equals("j")||
                huruf.equals("k")||
                huruf.equals("l")||
                huruf.equals("m")||
                huruf.equals("n")
        ){
            System.out.println("Huruf Konsonan");
        }else {
            System.out.println("Huruf Vokal");
        }
    }
}
