package com.juaracoding.arrayjava;

public class ArrayMultiDimensi {

    public static void main(String[] args) {
        int [][] angkaKu = {{1,2,3,4},{5,6,7}};
        for(int j=0;j<angkaKu.length;j++){
            for(int k=0;k<angkaKu[j].length;k++){
                System.out.print(angkaKu[j][k]+"||");
            }
            System.out.println();
        }

        int angkamu [][] = {{7,8,9,10},{11,12,13,14}};//int angkamu [][] = new int[2][4];
        for(int j=0;j<angkamu.length;j++){
            for(int k=0;k<angkamu[j].length;k++){
                System.out.print(angkamu[j][k]+"||");
            }
            System.out.println();
        }

    }
}
