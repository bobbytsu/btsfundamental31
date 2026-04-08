package com.juaracoding.exhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExample1 {

    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            int intX = 1/0;
            System.out.print("Masuk Bilangan Bulat : ");
            int intInput = sc.nextInt();
            System.out.println("Print intInput "+intInput);
        }catch(InputMismatchException e){
            System.out.println("Exception Sudah di Handle : "+e.getCause());
            return;
        }catch(IllegalArgumentException e){
            System.out.println("Exception Sudah di Handle : "+e.getCause());
            return;
        }catch(NullPointerException e){
            System.out.println("Exception Sudah di Handle : "+e.getCause());
            return;
        }catch(Exception e){
            System.out.println("Exception Sudah di Handle : "+e.getLocalizedMessage());
            return;
        }finally{
            sc.close();
        }
        System.out.println("ENDING  ");
    }
}
