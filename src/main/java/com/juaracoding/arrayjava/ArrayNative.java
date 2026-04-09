package com.juaracoding.arrayjava;

public class ArrayNative {

    public static void main(String[] args) {
//        int [] intArr = {0,1,2,3,4,5};//deklarasi + inisiasialisasi
//        for(int j=0;j<intArr.length;j++){
//            System.out.println(intArr[j]);
//        }
        int [] intArr2 = new int[6];// deklarasi
        intArr2[0] = 10;
        for(int j=0;j<intArr2.length;j++){
            System.out.println(intArr2[j]);
        }
        intArr2 = new int[10];
    }
}
