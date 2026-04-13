package com.juaracoding.oop.scope;

public class Coretan2 {


    public void proses1(Integer intX , String strX){

    }

    //OVERLOAD
    public void proses1(Double strX,Integer intX ){
    }

    public void luasSegitiga(Double a, Double t){
        System.out.println((a*t)/2);
    }

    /**
     * api versi 2 dari luasSegitiga
     * @param a
     * @param t
     * @param info -> untuk informasi pada saat response
     */
    public void luasSegitiga(Double a, Double t,String info){
        System.out.println((a*t)/2);
    }
    public void luasSegitiga(Integer a, Integer t){
        System.out.println((a*t)/2.0);
    }

    public void luasSegitiga(String a, String t){
        System.out.println((Double.parseDouble(a)*Double.parseDouble(t))/2.0);
    }
    public void luasSegitiga(String a, String t,Boolean bool){
        if(bool){
            System.out.println((Double.parseDouble(a)*Double.parseDouble(t))/2.0);
        }else {
            //simpan doang ke database
        }
    }

}
