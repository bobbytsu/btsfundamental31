package com.juaracoding.perulangan;

//convention naming
//jumlah_pembelian
//jumlahPembelian
public class ContohReturn {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Mulai");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("2");
        // kalau berhasil kalian attachment
        // kalau gagal kasih json
        if(true){
            return;
        }
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("4");
        Thread.sleep(1000);
        System.out.println("5");
    }
}
