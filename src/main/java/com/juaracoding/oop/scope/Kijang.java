package com.juaracoding.oop.scope;

import com.juaracoding.oop.Car;

public class Kijang extends Car {

    void coba(){
//        name = "yes";
        System.out.println(name);
        woi();
    }

    //mysql -> 3306
    //oracle -> 1521 --> 2717
    //postgresql -> 5432
    //sqlserver -> 1433
    //default 8080
    //override 7788
    //7788
    @Override
    public void woi() {
        System.out.println("Ngapain lu !!");
    }
}
