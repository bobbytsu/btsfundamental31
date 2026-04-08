package com.juaracoding.logikapercabangan;

public class CompareIfSwitch {


    public static void main(String[] args) {
        int intInput = 4;

        if(intInput == 1){
            System.out.println("Print 1");
        }else if(intInput == 2){
            System.out.println("Print 2");
        }else if(intInput == 3){
            System.out.println("Print 3");
        }else if(intInput == 4){
            System.out.println("Print 4");
        }else {
            System.out.println("else");
        }

        switch(intInput){
            case 1:
                System.out.println("print 1");break;
            case 2:
                System.out.println("print 2");break;
            case 3:
                System.out.println("print 3");break;
            case 4:
                System.out.println("print 4");break;
            default :System.out.println("default");break;
        }
        System.out.println("Proses selesai !!");
    }
}
